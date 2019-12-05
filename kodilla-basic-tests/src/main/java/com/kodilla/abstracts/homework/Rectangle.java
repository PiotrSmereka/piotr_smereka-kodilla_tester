package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(0, 5.2f, 6.1f,0,0,0);
    }

    @Override
    public void perimeter() {
        float perimeter;
        perimeter = 2 * (getRectangleLength() + getRectangleWidth());
        System.out.println("Perimeter of rectangle with length of: " + getRectangleLength() + " and width of: "
                + getRectangleWidth() + " is " + perimeter);
    }

    @Override
    public void area() {
        float area;
        area = getRectangleLength()*getRectangleWidth();
        System.out.println("Area of rectangle with length of: " + getRectangleLength() + " and width of: "
                + getRectangleWidth() +" is " + area);

    }
}
