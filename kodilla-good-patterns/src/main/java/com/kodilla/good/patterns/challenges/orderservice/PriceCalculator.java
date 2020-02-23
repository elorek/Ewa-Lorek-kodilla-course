package com.kodilla.good.patterns.challenges.orderservice;

public class PriceCalculator {
    public double calculatePrice(Product product) {
        return product.getProductPrice() * product.getHowMany();
    }
}
