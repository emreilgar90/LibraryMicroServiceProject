package com.emre.service;

import com.emre.repository.BookServiceRepository;
import com.fasterxml.jackson.core.type.TypeReference; //!!!
import com.emre.repository.entity.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JsonDataService {
    private final ObjectMapper objectMapper;
    private final BookServiceRepository bookServiceRepository;
    @PostConstruct
    public void saveItemsFromJson() {
        try {
            ClassPathResource resource = new ClassPathResource("data/book.json");
            InputStream inputStream = resource.getInputStream();
            List<Book> books = objectMapper.readValue(inputStream, new TypeReference<List<Book>>() {
            });
            bookServiceRepository.saveAll(books);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
