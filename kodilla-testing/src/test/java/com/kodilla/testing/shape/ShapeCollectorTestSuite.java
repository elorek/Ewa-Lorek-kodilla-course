package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(2.5, 5);
        // When
        shapeCollector.addFigure(triangle);
        // Then
        Shape result = shapeCollector.getFigure(0);
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void testRemoveFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(2.5, 5);
        Shape circle = new Circle(4.5);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        // When
        shapeCollector.removeFigure(triangle);
        // Then
        Shape result = shapeCollector.getFigure(0);
        Assert.assertEquals(circle, result);
    }
}
