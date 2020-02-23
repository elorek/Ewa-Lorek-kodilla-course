package com.kodilla.good.patterns.challenges.food2door;

public class ProducerFactory {
    public static Producer getProducer(String producerID) {
        switch (producerID) {
            case "NewProducer1" : return new NewProducer1();
            case "NewProducer2" : return new NewProducer2();
            default: return null;
        }
    }
}
