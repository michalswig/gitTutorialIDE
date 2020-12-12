package com.kodilla.testing.collection;


import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        if (numbers.isEmpty()) {
            return numbers;
        } else {
            for (Integer number : numbers) {
                if (number % 2 == 0 && number != 0) {
                    oddNumbers.add(number);
                }
            }
            return oddNumbers;
        }
    }
}