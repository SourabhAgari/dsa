package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountPosAndNegTest {

    @Test
    void countsPositiveAndNegativeNumbers() {
        int[] numbers = {-4, 0, 7, -2, 9, 1};
        int[] result = CountPosAndNeg.getPosAndNeg(numbers);
        assertArrayEquals(new int[]{3, 2}, result);
    }

    @Test
    void ignoresZeroes() {
        int[] numbers = {0, 0, 0};
        int[] result = CountPosAndNeg.getPosAndNeg(numbers);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    void returnsNoNegativesForAnAllPositiveArray() {
        int[] numbers = {2, 4, 6};
        int[] result = CountPosAndNeg.getPosAndNeg(numbers);
        assertArrayEquals(new int[]{3, 0}, result);
    }
}
