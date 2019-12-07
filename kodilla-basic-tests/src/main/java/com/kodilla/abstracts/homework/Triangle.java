package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(3.2,4.1,5.4);
    }
    @Override
    public void calculationOfPerimeter() {
        double perimeter;
        perimeter = getSideA() + getSideB() + getSideC();
        System.out.println("Perimeter of triangle with sides of: " + getSideA() + ", "
                + getSideB() + ", " +getSideC() + " is " + perimeter);
    }
    @Override
    public void calculationOfArea() {
        double area;
        double resArea;
        area = (getSideA()+getSideB()+getSideC())/2;
        resArea = Math.sqrt(area* (area - getSideA()) * (area - getSideB()) * (area - getSideC()));
        System.out.println("Area of triangle with sides of: " + getSideA() + ", "
                + getSideB() + ", " +getSideC() + " is " + resArea);
    }
}