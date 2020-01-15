package com.kodilla.collections.adv.immutable.special.homework;


import java.util.HashSet;
import java.util.Set;

public class BookManager {
    public Book createBook(String title, String author) {
        return new Book(title, author);
    }

    public Book addBook()
        Set<Book> library = new HashSet<>();
        library.add(new Book("Cars", "P. Newman"));
        library.add(new Book("My Home", "R. Norris"));
        library.add(new Book("New history", "T. Mal"));
        library.add(new Book("New history", "T. Mal"));


}