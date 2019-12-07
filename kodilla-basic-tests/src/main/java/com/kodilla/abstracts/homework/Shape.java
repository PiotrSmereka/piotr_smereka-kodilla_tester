package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double radius;
    private double sideA;
    private double sideB;
    private double sideC;

    public Shape (double radius) {
        this.radius = radius;
    }
     public Shape (double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Shape (double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC ;
    }
    public double getRadius() {
        return radius;
    }
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public abstract void calculationOfPerimeter();
    public abstract void calculationOfArea();
}
