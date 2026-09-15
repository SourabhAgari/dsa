package com.healthcare.arrays.prefixsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PivotIndexTest {

    private int result;

    @Test
    void shouldReturnPivotIndexWhenPivotExists() {
        int[] arr = {1, 7, 3, 6, 5, 6};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(3, result);
    }

    @Test
    void shouldReturnZeroWhenFirstIndexIsPivot() {
        int[] arr = {2, 1, -1};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnLastIndexWhenLastIndexIsPivot() {
        int[] arr = {1, -1, 2};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(2, result);
    }

    @Test
    void shouldReturnMinusOneWhenPivotDoesNotExist() {
        int[] arr = {1, 2, 3};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(-1, result);
    }

    @Test
    void shouldReturnZeroForSingleElementArray() {
        int[] arr = {5};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroForTwoZeroElements() {
        int[] arr = {0, 0};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnFirstPivotWhenMultiplePivotIndexesExist() {
        int[] arr = {0, 0, 0, 0};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(0, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] arr = {-1, -1, 0, -1, -1};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(2, result);
    }

    @Test
    void shouldHandleMixedPositiveAndNegativeNumbers() {
        int[] arr = {-1, 2, 3, 0, 3, 2, -1};

        int result = PivotIndex.getPivotIndexOptimal(arr);

        assertEquals(3, result);
    }
}

