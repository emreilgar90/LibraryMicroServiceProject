package com.emre.repository;

import com.emre.repository.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookServiceRepository extends JpaRepository<Book,String> {
    Optional<Book> getByIsbn(String isbn);
    Optional<Book>findById(String id);






}
