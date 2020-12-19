package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
/*
    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle(4.5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(4,2);

        ShapeCollector listToTest = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square)));
        ShapeCollector listToBe = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square, triangle)));

        //When
        listToTest.addFigure(triangle);

        //Then
        Assertions.assertEquals(listToTest, listToBe);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(4.5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(4,2);
        ShapeCollector listToTest = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square, triangle)));
        ShapeCollector listToBe = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square)));

        //When
        listToTest.removeFigure(triangle);

        //Then
        Assertions.assertEquals(listToBe, listToTest);

    }
 */


    @Test
    public void testGetFigure() {

        //Given
        Circle circle = new Circle(4.5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(4,2);
        ShapeCollector listToTest = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square, triangle)));

        //When
        Shape shape = listToTest.getFigure(1);
        //Then
        Assertions.assertEquals(shape, square);


    }

    @Test public void testShowFigures() {
        //Given
        Circle circle = new Circle(4.5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(4,2);
        ShapeCollector listToTest = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square, triangle)));
        //When
        ShapeCollector listToBe = listToTest;
        //Then
        Assertions.assertEquals(listToTest, listToBe);
    }
}



