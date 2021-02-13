package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {

        //Given
        //When
        Double score1 = calculator.add(2, 4);
        //Then
        assertEquals(6, score1);

        //Given
        //When
        Double score2 = calculator.sub(4, 2);
        //Then
        assertEquals(2, score2);

        //Given
        //When
        Double score3 = calculator.div(4, 2);
        //Then
        assertEquals(2, score3);

        //Given
        //When
        Double score4 = calculator.mul(2, 4);
        //Then
        assertEquals(8, score4);

    }


}
