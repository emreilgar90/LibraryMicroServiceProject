package com.emre.controller;

import com.emre.dto.BookDto;
import com.emre.dto.BookIdDto;
import com.emre.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

import static com.emre.constans.RestApi.*;


@RestController
@RequestMapping(BOOK)
public class BookController {
    Logger logger= LoggerFactory.getLogger(BookController.class);
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getAllBook")
    public ResponseEntity<List<BookDto>> getAllBook(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }


    @GetMapping("/isbn/{isbn}")
    public ResponseEntity<BookIdDto> getByIsbn(@PathVariable @NotEmpty String isbn){
        logger.info("Book info by " + isbn);
        return ResponseEntity.ok(bookService.findByIsbn(isbn));

    }

    @GetMapping("/book{bookId}")
    public  ResponseEntity<BookDto> getBookDetailsById(@PathVariable @NotEmpty String bookId){
        return ResponseEntity.ok(bookService.findBookDetailsById(bookId));
    }
    @PostMapping("/addBook")
    public ResponseEntity<Boolean> addBook(@RequestBody BookDto bookDto){
        return ResponseEntity.ok(bookService.addBook(bookDto));
    }
}
