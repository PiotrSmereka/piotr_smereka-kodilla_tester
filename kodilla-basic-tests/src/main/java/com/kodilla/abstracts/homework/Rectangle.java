package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(4.1, 5.3);
    }
    @Override
    public void calculationOfPerimeter() {
        double perimeter;
        perimeter = 2 * (getSideA() + getSideB());
        System.out.println("Perimeter of rectangle with length of: " + getSideA() + " and width of: "
                + getSideB() + " is " + perimeter);
    }
    @Override
    public void calculationOfArea() {
        double area;
        area = getSideA()*getSideB();
        System.out.println("Area of rectangle with length of: " + getSideA() + " and width of: "
                + getSideB() +" is " + area);
    }
}
