package com.morski.springlibrary.controller;

import com.morski.springlibrary.domain.Book;
import com.morski.springlibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/books")
    public String getBooks(Model model) {
        ArrayList<Book> allBooks = bookService.getAllBooks();
        model.addAttribute("books", allBooks);
        model.addAttribute("hello", "Hello World");
        return "books";
    }
}
