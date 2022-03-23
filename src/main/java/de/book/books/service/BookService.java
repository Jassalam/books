package de.book.books.service;

import de.book.books.domain.Book;
import de.book.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookMapper bookMapper;

    public List<BookDto> getAllBooks() {
        return bookMapper.todtoList(bookRepository.findAll());
    }
}
