package com.emre.service;

import com.emre.dto.AddBookRequestDto;
import com.emre.dto.LibraryDto;
import com.emre.exception.ErrorType;
import com.emre.exception.LibraryServiceManagerException;
import com.emre.manager.BookManager;
import com.emre.mapper.ILibraryMapper;
import com.emre.repository.LibraryRepository;
import com.emre.repository.entity.Library;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;
    private final BookManager bookManager;
    private final ILibraryMapper libraryMapper;

    public LibraryService(LibraryRepository repository, BookManager bookManager, ILibraryMapper libraryMapper) {
        this.libraryRepository = repository;
        this.bookManager = bookManager;
        this.libraryMapper = libraryMapper;
    }


    public LibraryDto getAllBookSLibraryById(String id) {
        Library library= libraryRepository.findById(id)
                .orElseThrow(()->new LibraryServiceManagerException(ErrorType.LIBRARY_NOT_FOUND_EXCEPTION));

        LibraryDto libraryDto= new LibraryDto(library.getId(),
                library.getUserBook().stream()
                        .map(book->bookManager.getBookDetailsById(book).getBody())
                        //.map(bookManager::getBookDetailsById)
                        //.map(ResponseEntity::getBody)
                        .collect(Collectors.toList()));
        return libraryDto;
    }

    public LibraryDto createLibrary() {
        Library library =libraryRepository.save(new Library());
        LibraryDto libraryDto=ILibraryMapper.INSTANCE.toLibraryDto(library);
        return libraryDto;
    }

    public void addBookToLibrary(AddBookRequestDto dto){
        String bookId= bookManager.getByIsbn(dto.getIsbn()).getBody().getId();
        Library library= libraryRepository.findById(bookId)
                .orElseThrow(()->new LibraryServiceManagerException(ErrorType.LIBRARY_NOT_FOUND_EXCEPTION));

        library.getUserBook()
                .add(bookId);

        libraryRepository.save(library);
    }
}
