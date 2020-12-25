package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        for(int i = 0; i < 20; i++){
            numbers[i] = i;
        }

        //When
        double testAverageResult = 9.5;

        //Then
        assertEquals(testAverageResult, ArrayOperations.getAverage(numbers));
    }
}
