package com.emre.controller;

import com.emre.dto.AddBookRequestDto;
import com.emre.dto.LibraryDto;
import com.emre.service.LibraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("{id}")
    public ResponseEntity<LibraryDto> getAllBooksLibraryById(@PathVariable String id){
        return ResponseEntity.ok(libraryService.getAllBookSLibraryById(id));
    }
    @PostMapping("/createLibrary")
    public ResponseEntity<LibraryDto> createLibrary(){
        return ResponseEntity.ok(libraryService.createLibrary());
    }
    @PutMapping("/addBookToLibrary")
    public ResponseEntity<Void>  addBookToLibrary(@RequestBody AddBookRequestDto dto){
        libraryService.addBookToLibrary(dto);
        return ResponseEntity.ok().build();

    }
}
