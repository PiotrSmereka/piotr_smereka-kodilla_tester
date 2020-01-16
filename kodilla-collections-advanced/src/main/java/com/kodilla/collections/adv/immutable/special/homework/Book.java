package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
