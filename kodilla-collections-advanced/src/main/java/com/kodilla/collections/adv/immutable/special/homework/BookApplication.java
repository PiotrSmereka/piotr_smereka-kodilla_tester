package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
     BookManager bookManager = new BookManager();

     bookManager.createBook("Cars", "P. Newman");
     bookManager.createBook("My Home", "R. Norris");
     bookManager.createBook("New history", "T. Mal");

     System.out.println(bookManager.hashCode());
    }
}
