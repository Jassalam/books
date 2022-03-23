package de.book.books.service;

import de.book.books.domain.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toEntity(BookDto bookDto);

    @Mapping(source = "name", target = "book")
    BookDto toDto(Book book);

    List<BookDto> todtoList(List<Book> bookList);

}
