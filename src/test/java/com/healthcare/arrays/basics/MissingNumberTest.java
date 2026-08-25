package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @Test
    void returnsZeroWhenFirstNumberIsMissing() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(0, MissingNumber.MissedNumber(arr));
    }

    @Test
    void returnsMissingNumberFromMiddleOfArray() {
        int[] arr = {0, 1, 3, 4, 5};
        assertEquals(2, MissingNumber.MissedNumber(arr));
    }

    @Test
    void returnsLastNumberWhenItIsMissing() {
        int[] arr = {0, 1, 2, 3};
        assertEquals(4, MissingNumber.MissedNumber(arr));
    }

    @Test
    void returnsZeroForEmptyArray() {
        int[] arr = {};
        assertEquals(0, MissingNumber.MissedNumber(arr));
    }
}
