package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("NewProducer1", "dairy products", 150));
        orderList.add(new Order("NewProducer2", "meat", 100));
        User user = new User("James", "Smith");
        Food2Door food2Door = new Food2Door();
        for(Order order: orderList)
            food2Door.processOrder(order, user);

    }
}
