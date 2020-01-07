package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int drawnIncreasedSpeed = random.nextInt(100) +1;
        int drawnCarMake = random.nextInt(3);
        if (drawnCarMake == 0)
            return new Fiat(drawnIncreasedSpeed);
        else if (drawnCarMake == 1)
            return new Ford (drawnIncreasedSpeed);
        else
            return new Opel(drawnIncreasedSpeed);
    }
    public static void main(String[] args) {
        Car[] cars = new Car [15];
        for (int n=0; n <cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
}
