package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    double field;

    public Square(double sideLength) {
        this.shapeName = "square";
        this.field = Math.pow(sideLength, 2);
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }

}
