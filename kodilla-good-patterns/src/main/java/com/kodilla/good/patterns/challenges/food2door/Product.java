package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    String productName;
    boolean isBought;

    public Product(String productName, boolean isBought) {
        this.productName = productName;
        this.isBought = isBought;
    }

    public String getProductName() {
        return productName;
    }

    public boolean isBought() {
        return true;
    }
}
