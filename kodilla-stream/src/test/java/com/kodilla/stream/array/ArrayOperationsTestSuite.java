package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = new int[20];
        numbers[0] = 38;
        numbers[1] = 67;
        numbers[2] = 94;
        numbers[3] = 31;
        numbers[4] = 26;
        numbers[5] = 17;
        numbers[6] = 22;
        numbers[7] = 34;
        numbers[8] = 67;
        numbers[9] = 12;
        numbers[10] = 9;
        numbers[11] = 54;
        numbers[12] = 71;
        numbers[13] = 42;
        numbers[14] = 7;
        numbers[15] = 21;
        numbers[16] = 79;
        numbers[17] = 99;
        numbers[18] = 5;
        numbers[19] = 63;

        // When
        double avg = ArrayOperations.getAverage(numbers);
        // Then
        Assert.assertEquals(42.9, avg, 0.001);

    }
}
