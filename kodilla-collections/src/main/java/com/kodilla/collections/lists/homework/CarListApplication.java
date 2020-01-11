package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Fiat;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication
{
    public static void main(String[] args) {
        List<Fiat> cars = new ArrayList<>();
        Fiat fiat = new Fiat(222);
        cars.add(fiat);
        cars.add(new Fiat(180));
        cars.add(new Fiat(167));

        for (Fiat car: cars) {
            CarUtils.describeCar(car);
        }
        System.out.println(cars.size());
        cars.remove(1);
        cars.remove(fiat);

        for (Fiat car: cars) {
            CarUtils.describeCar(car);
        }
        System.out.println(cars.size());
    }
}