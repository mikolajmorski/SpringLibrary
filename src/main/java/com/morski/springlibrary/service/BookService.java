package com.morski.springlibrary.service;

import com.morski.springlibrary.domain.Book;
import com.morski.springlibrary.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public ArrayList<Book> getAllBooks() {
        return new ArrayList<>(bookRepository.getAllBooks());
    }
}
