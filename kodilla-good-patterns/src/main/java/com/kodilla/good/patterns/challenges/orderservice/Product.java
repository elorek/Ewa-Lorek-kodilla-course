package com.kodilla.good.patterns.challenges.orderservice;

public final class Product {
    private final String productName;
    private final double productPrice;
    private final int howMany;

    public Product(final String productName, final double productPrice, final int howMany) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.howMany = howMany;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getHowMany() {
        return howMany;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", howMany=" + howMany +
                '}';
    }
}
