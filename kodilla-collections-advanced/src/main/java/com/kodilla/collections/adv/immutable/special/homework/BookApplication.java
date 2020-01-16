package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Set;

public class BookApplication {

    public static void main(String[] args) {
     BookManager bookManager = new BookManager();

     Book book1 = bookManager.createBook("Cars", "P. Newman");
     Book book2 = bookManager.createBook("My Home", "R. Norris");
     Book book3 = bookManager.createBook("New history", "T. Mal");
     Book book4 = bookManager.createBook("New history", "T. Mal");


     System.out.println(book1.hashCode());
     System.out.println(book2.hashCode());
     System.out.println(book3.hashCode());
     System.out.println(book4.hashCode());
     System.out.println("--------------");

     Set<Book> library = bookManager.getLibrary();
     System.out.println(library.size());
     for (Book l: library){// wyciagniecie obiektow klasy Book z kolekcji i przypisanie do zmiennych l
          System.out.println(l.hashCode());
     }
    }
}
