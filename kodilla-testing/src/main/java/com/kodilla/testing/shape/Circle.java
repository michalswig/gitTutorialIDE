package com.kodilla.testing.shape;

public class Circle implements Shape {

    String shapeName = "circle";
    double radiusLength;

    @Override
    public String getShapeName() {
    return shapeName;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radiusLength, 2);
    }

}
