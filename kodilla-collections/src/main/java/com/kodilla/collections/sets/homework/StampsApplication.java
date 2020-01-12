package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Bird", 12, 10,true ));
        stamps.add(new Stamp("Flower", 4, 7, false));
        stamps.add(new Stamp("Car", 10, 9,true));
        stamps.add(new Stamp("Bird", 12, 10, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
