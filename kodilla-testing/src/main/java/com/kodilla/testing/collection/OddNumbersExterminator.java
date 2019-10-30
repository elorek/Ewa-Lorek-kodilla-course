package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> theListOfEvenNumbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int n = 0; n < theListOfEvenNumbers.size(); n++) {
            int sampleValue = theListOfEvenNumbers.get(n);
            if (sampleValue % 2 == 0) {
                result.add(sampleValue);
            }
        }
        return result;
    }
}
