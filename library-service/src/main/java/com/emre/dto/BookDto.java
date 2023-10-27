package com.emre.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BookDto {
    private BookIdDto id;
    private String title;
    private String bookYear;
    private String author;
    private String pressName;
}
