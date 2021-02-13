package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    Double displayValue(double val){
        System.out.println("the score: " + val);
        return val;
    }

}
