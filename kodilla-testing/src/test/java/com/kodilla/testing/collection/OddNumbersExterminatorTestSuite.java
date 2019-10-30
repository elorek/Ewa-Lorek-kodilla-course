package com.kodilla.testing.collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OddNumbersExterminatorTestSuite {
    @Test
    public void testExterminateEmptyList () {
        //given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //then
        assertEquals(0, result.size());
    }
    @Test
    public void testExterminateNormalList () {
        //given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(21);
        numbers.add(38);
        numbers.add(46);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(38);
        expectedResult.add(46);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //then
        assertEquals(expectedResult, result);
    }
}