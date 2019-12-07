package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public Circle() {
        super(3);
    }
    @Override
    public void calculationOfPerimeter() {
        double perimeter;
        perimeter = getRadius() * 2* Math.PI;
        System.out.println("Circumference of circle with radius of: " + getRadius() + " is " + perimeter);
    }
    @Override
    public void calculationOfArea() {
        double area;
        area = getRadius() * getRadius()* Math.PI;
        System.out.println("Area of circle with radius of: " + getRadius() + " is " + area);
    }
}