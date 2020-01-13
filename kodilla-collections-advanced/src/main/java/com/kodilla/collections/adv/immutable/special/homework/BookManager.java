package com.kodilla.collections.adv.immutable.special.homework;

import com.kodilla.collections.adv.immutable.Book;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    public Book createBook (String title, String author) {
        return new Book(title, author);
    }
    Set<Book> createBook = new HashSet<>();
}
