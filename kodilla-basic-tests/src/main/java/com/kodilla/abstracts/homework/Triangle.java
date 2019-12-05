package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(0, 0, 0,3.2f,4.1f,5.4f);
    }

    @Override
    public void perimeter() {
        float perimeter;
        perimeter = getTriangleSideA() + getTriangleSideB() + getTriangleSideC();
        System.out.println("Perimeter of triangle with sides of: " + getTriangleSideA() + ", "
                + getTriangleSideB() + ", " +getTriangleSideC() + " is " + perimeter);
    }

    @Override
    public void area() {
        float area;
        float resArea;
        area = (getTriangleSideA()+getTriangleSideB()+getTriangleSideC())/2;
        resArea = (float) Math.sqrt(area* (area - getTriangleSideA()) * (area - getTriangleSideB()) * (area - getTriangleSideC()));
        System.out.println("Area of triangle with sides of: " + getTriangleSideA() + ", "
                + getTriangleSideB() + ", " +getTriangleSideC() + " is " + resArea);

    }
}