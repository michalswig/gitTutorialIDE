package com.kodilla.bogosort;

import java.util.*;

public class WorstSortEver {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> numberList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            numberList.add(rand.nextInt(1000));
        }
        while(!isListSorted(numberList)){
            Collections.shuffle(numberList);

        }



        numberList.forEach(i -> System.out.println(i));

    }

    private static boolean isListSorted(List<Integer> numberList) {
        if(numberList == null) {
            return true;
        }
        int length = numberList.size();
        if(length <= 1) {
            return true;
        }
        return false;
    }
}
