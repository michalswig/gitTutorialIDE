package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName = "square";
    double sideLength;

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return Math.pow(sideLength, 2);
    }
}
