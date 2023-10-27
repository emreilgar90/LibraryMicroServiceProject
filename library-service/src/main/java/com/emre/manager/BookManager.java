package com.emre.manager;

import com.emre.dto.BookDto;
import com.emre.dto.BookIdDto;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="book-service",path = "/v1/book")
public interface BookManager {

    @GetMapping("/isbn/{isbn}")
    ResponseEntity<BookIdDto> getByIsbn(@PathVariable String isbn);



    @GetMapping("/book/{bookId}")
    ResponseEntity<BookDto> getBookDetailsById(@PathVariable String bookId);


}
