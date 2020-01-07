package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Fiat;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Fiat> cars = new ArrayList<>();
        cars.add(new Fiat(222));
        cars.add(new Fiat(180));
        cars.add(new Fiat(167));


        System.out.println(cars.size());
    }
}
