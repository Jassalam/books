package de.book.books.service;

public class BookDto {
    private String author;
    private String book;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookDto{" +
            "author='" + author + '\'' +
            ", book='" + book + '\'' +
            '}';
    }
}
