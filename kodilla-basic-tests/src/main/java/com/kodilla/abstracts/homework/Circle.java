package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public Circle() {
        super(4.2f, 0, 0,0, 0,0);
    }

    @Override
    public void perimeter() {
        float perimeter;
        perimeter = (float) (getCircleRadius() * 2* Math.PI);
        System.out.println("Circumference of circle with radius of: " + getCircleRadius() + " is " + perimeter);
    }

    @Override
    public void area() {
        float area;
        area = (float) (getCircleRadius() * getCircleRadius()* Math.PI);
        System.out.println("Area of circle with radius of: " + getCircleRadius() + " is " + area);
    }
}