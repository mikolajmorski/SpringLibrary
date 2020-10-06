package com.morski.springlibrary;

import com.morski.springlibrary.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Book lotr = new Book("Lord of the rings", "Tolkien");
        Book witcher = new Book("Wiedzmin", "Sapkowski");

        System.out.println(lotr.toString());
        System.out.println(witcher.toString());
    }

}
