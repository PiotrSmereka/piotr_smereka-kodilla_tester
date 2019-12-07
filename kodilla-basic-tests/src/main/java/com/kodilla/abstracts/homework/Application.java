package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.calculationOfPerimeter();
        circle.calculationOfArea();

        Shape rectangle = new Rectangle();
        rectangle.calculationOfPerimeter();
        rectangle.calculationOfArea();

        Shape triangle = new Triangle();
        triangle.calculationOfPerimeter();
        triangle.calculationOfArea();
    }
}
