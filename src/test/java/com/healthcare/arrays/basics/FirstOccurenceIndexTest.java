package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstOccurenceIndexTest {

    @Test
    void returnsIndexOfFirstMatchWhenElementOccursMultipleTimes() {
        int[] numbers = {8, 3, 5, 3, 9};
        int index = FirstOccurenceIndex.getFirstOccurenceIndex(numbers, 3);
        assertEquals(1, index);
    }

    @Test
    void returnsZeroWhenFirstElementMatches() {
        int[] numbers = {3, 8, 3, 9};
        int index = FirstOccurenceIndex.getFirstOccurenceIndex(numbers, 3);
        assertEquals(0, index);
    }

    @Test
    void returnsZeroWhenElementIsMissing() {
        int[] numbers = {8, 5, 9};
        int index = FirstOccurenceIndex.getFirstOccurenceIndex(numbers, 3);
        assertEquals(0, index);
    }
}
