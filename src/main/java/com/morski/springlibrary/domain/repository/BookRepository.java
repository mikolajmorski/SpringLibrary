package com.morski.springlibrary.domain.repository;

import com.morski.springlibrary.domain.Book;
import com.morski.springlibrary.util.Ids;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BookRepository {

    Map<Integer, Book> books = new HashMap<>();

    public BookRepository() {

    }
    public void createBook(String title, String author) {
        Book book = new Book(title, author);
        book.setId(Ids.generateNewId(books.keySet()));
        books.put(book.getId(), book);
    }

    public Collection<Book> getAllBooks() {
        return books.values();
    }
}

