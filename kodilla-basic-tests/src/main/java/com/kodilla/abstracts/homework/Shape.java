package com.kodilla.abstracts.homework;

public abstract class Shape {
    private float circleRadius;
    private float rectangleLength;
    private float rectangleWidth;
    private float triangleSideA;
    private float triangleSideB;
    private float triangleSideC;

    public Shape (float circleRadius, float rectangleLength, float rectangleWidth, float triangleSideA, float triangleSideB, float triangleSideC){
        this.circleRadius = circleRadius;
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
        this.triangleSideA = triangleSideA;
        this.triangleSideB = triangleSideB;
        this.triangleSideC = triangleSideC;
    }
    public float getCircleRadius() {
        return circleRadius;
    }
    public float getRectangleLength() {
        return rectangleLength;
    }
    public float getRectangleWidth() {
        return rectangleWidth;
    }
    public float getTriangleSideA() {
        return triangleSideA;
    }
    public float getTriangleSideB() {
        return triangleSideB;
    }
    public float getTriangleSideC() {
        return triangleSideC;
    }
    public abstract void perimeter();
    public abstract void area();
}
