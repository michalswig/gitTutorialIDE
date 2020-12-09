package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theFormerUser");
        String result = simpleUser.getUsername();

        if(result.equals("theFormerUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();
        int resultOne = calculator.add(45, 67);
        int resultTwo = calculator.substract(456, 122);
        System.out.println(resultOne);
        System.out.println(resultTwo);

        System.out.println("test jednostkowy metody dodawania");
        int testResultAdd = 112;
        if(resultOne == testResultAdd) {
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }

        System.out.println("test jednostkowy metody odejmowania");
        int testResultSubst = 334;
        if(resultTwo == testResultSubst) {
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }


    }
}
