package com.kodilla.collections.adv.immutable.special.homework;


import java.util.HashSet;
import java.util.Set;

public class BookManager {
    private Set<Book> library = new HashSet<>();
    public Book createBook(String title, String author) {
        Book book = new Book (title, author);
        library.add(book);
        return book;
    }
    public Set<Book> getLibrary(){
        return library;
    }
}