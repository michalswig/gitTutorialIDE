package com.kodilla.testing.shape;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {

    private ArrayList<Shape> shapeArrayList = new ArrayList<Shape>();

    public ShapeCollector(ArrayList<Shape> shapeArrayList) {
        this.shapeArrayList = shapeArrayList;
    }

    public void addFigure(Shape shape) {
        shapeArrayList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeArrayList.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeArrayList.get(n);
    }

    public ArrayList<Shape> showFigures() {
        return shapeArrayList;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shapeArrayList=" + shapeArrayList +
                '}';
    }


}
