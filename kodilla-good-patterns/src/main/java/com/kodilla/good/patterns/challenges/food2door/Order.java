package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private String producerID;
    private String whatProduct;
    private int howMany;

    public Order(String producerID, String whatProduct, int howMany) {
        this.producerID = producerID;
        this.whatProduct = whatProduct;
        this.howMany = howMany;
    }

    public String getProducerID() {
        return producerID;
    }

    public String getWhatProduct() {
        return whatProduct;
    }

    public int getHowMany() {
        return howMany;
    }
}
