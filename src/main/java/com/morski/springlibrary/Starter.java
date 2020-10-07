package com.morski.springlibrary;

import com.morski.springlibrary.domain.Book;
import com.morski.springlibrary.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        bookRepository.createBook("Lord of the rings", "Tolkien");
        bookRepository.createBook("Wiedzmin", "Sapkowski");
    }

}
