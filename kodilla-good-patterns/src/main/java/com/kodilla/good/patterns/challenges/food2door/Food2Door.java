package com.kodilla.good.patterns.challenges.food2door;

public class Food2Door {
    public void processOrder(Order order, User user) {
        Producer producer = ProducerFactory.getProducer(order.getProducerID());
        producer.process(order);
        System.out.println(producer.inform(user));
    }
}
