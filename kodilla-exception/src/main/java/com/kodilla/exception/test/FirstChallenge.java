package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            firstChallenge.divide(3, 0);
        } catch (ArithmeticException a) {
            System.out.println("Change the second value! Error:" + a);
        } finally {
            System.out.println("The result of division:");
        }

    }
}
