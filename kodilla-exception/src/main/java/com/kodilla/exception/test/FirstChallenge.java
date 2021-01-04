package com.kodilla.exception.test;

public class FirstChallenge {

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3,0);
        System.out.println(result);
    }

    public double divide(double a, double b) {
        try {
            if (b == 0);
        } catch(ArithmeticException e) {
            System.out.println("Error" + e);
        }
        return a / b;
    }


}
