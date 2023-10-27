package com.emre.mapper;

import com.emre.dto.BookDto;
import com.emre.dto.BookIdDto;
import com.emre.repository.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE )
public interface IBookMapper {
    IBookMapper INSTANCE = Mappers.getMapper(IBookMapper.class);

    List<BookDto> toBookDto(final List<Book> bookList);

    BookDto toBookDto(final Book book);
    BookIdDto toBookIdDto(final Book book);

    Book toBook(final BookDto bookDto);


}
