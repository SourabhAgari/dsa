package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOccurenceTest {

    @Test
    void countsEveryOccurrenceOfAnElement() {
        int[] numbers = {4, 7, 4, 1, 4, 9};
        int count = CheckOccurence.checkOccurence(numbers, 4);
        assertEquals(3, count);
    }

    @Test
    void returnsZeroWhenElementIsMissing() {
        int[] numbers = {4, 7, 1, 9};
        int count = CheckOccurence.checkOccurence(numbers, 2);
        assertEquals(0, count);
    }
}
