package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.kodilla.testing.collection.OddNumbersExterminator.exterminate;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("test suite: end");
    }

    @DisplayName(
            "When creating List with 20 numbers, test when list is empty "
    )

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList=new ArrayList<Integer>();
        //When
        List<Integer> listNumbers=OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing the list: " + listNumbers);
        //Then
        Assertions.assertEquals(emptyList,listNumbers);
        System.out.println("Test passed");
    }

    @DisplayName(
            "When creating List with 20 digits, test when list contains odd and even numbers "
    )

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        //ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(234,567,22,899,12,15,3,5));
        List<Integer> oddList=new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,14,16,18));
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++) {
            list.add(i);
        }
        //When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("testing the list: " + listNumbers);
        //Then
        Assertions.assertEquals(oddList, listNumbers);
        System.out.println("Test passed");
    }


}
