package com.emre.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor
@Data //getter setter
@Builder
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "BOOK")
public class Book  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String bookYear;
    private String author;
    private String pressName;
    private String isbn;

    public Book(Long id, String title, String bookYear, String author, String pressName, String isbn) {
        this.id = id;
        this.title = title;
        this.bookYear = bookYear;
        this.author = author;
        this.pressName = pressName;
        this.isbn = isbn;
    }

}
