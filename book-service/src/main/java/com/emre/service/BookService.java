package com.emre.service;

import com.emre.dto.BookDto;
import com.emre.dto.BookIdDto;
import com.emre.exception.BookServiceManagerException;
import com.emre.exception.ErrorType;
import com.emre.mapper.IBookMapper;
import com.emre.repository.BookServiceRepository;
import com.emre.repository.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookServiceRepository repository;

    public BookService(BookServiceRepository repository) {
        this.repository = repository;
    }

    public List<BookDto> getAllBooks() {
        List<Book> bookList=repository.findAll();
        return  IBookMapper.INSTANCE.toBookDto(bookList);
    }

    public BookIdDto findByIsbn(String isbn) {
        try{
            Optional<Book> book= repository.getByIsbn(isbn);
            return IBookMapper.INSTANCE.toBookIdDto(book.get());
        }catch (Exception e){
            throw new BookServiceManagerException(ErrorType.ISBN_NOT_FOUND);
        }

    }
    public BookDto findBookDetailsById(String id) {
        try {
            Optional<Book> book= repository.findById(id);
            return  IBookMapper.INSTANCE.toBookDto(book.get());
        }catch (Exception e){
            throw new BookServiceManagerException(ErrorType.ID_NOT_FOUND);
        }

    }

    public Boolean addBook(BookDto bookDto) {
        try {
            Book book= IBookMapper.INSTANCE.toBook(bookDto);
            repository.save(book);
            return true;

        }catch (Exception e){
            return false;
        }

    }
}
