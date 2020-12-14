package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String shapeName = "triangle";
    double baseLength;
    double heightLength;

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (baseLength * heightLength)/2;
    }
}
