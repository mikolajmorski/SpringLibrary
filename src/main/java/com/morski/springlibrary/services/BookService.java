package com.morski.springlibrary.services;

import com.morski.springlibrary.domain.Book;
import com.morski.springlibrary.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public ArrayList<Book> getAllBooks() {
        return new ArrayList<>(bookRepository.getAllBooks());
    }
}
