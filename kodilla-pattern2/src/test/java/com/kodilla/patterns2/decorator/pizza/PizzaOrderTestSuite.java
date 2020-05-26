package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Tomato sauce and cheese", description);
    }

    @Test
    public void testCheesyCrustGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesyCrustDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22), calculatedCost);
    }

    @Test
    public void testCheesyCrustGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Tomato sauce and cheese + cheesy crust", description);
    }

    @Test
    public void testExtraSauceAndHumGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraSauceDecorator(theOrder);
        theOrder = new HumDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testExtraSauceAndHumGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Tomato sauce and cheese + extra sauce + hum", description);
    }

    @Test
    public void testEverythingGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraSauceDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HumDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new CheesyCrustDecorator(theOrder);
        theOrder = new StuffedCrustDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(45), calculatedCost);
    }

    @Test
    public void testEverythingGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraSauceDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HumDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new CheesyCrustDecorator(theOrder);
        theOrder = new StuffedCrustDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Tomato sauce and cheese + extra sauce + extra cheese + hum + mushrooms" +
                "cheesy crust + stuffed crust", description);
    }
}
