package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.perimeter();
        circle.area();

        Shape rectangle = new Rectangle();
        rectangle.perimeter();
        rectangle.area();

        Shape triangle = new Triangle();
        triangle.perimeter();
        triangle.area();
    }
}
