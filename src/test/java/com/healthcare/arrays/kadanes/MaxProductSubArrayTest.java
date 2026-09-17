package com.healthcare.arrays.kadanes;

import com.healthcare.kadanes.MaxProductSubArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProductSubArrayTest {
    @Test
    void testMixedNumbers() {
        int[] arr = {-2, 3, -2, 4};
        assertEquals(48, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testExampleWithZero() {
        int[] arr = {2, 3, -2, 4};
        assertEquals(6, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testTwoNegativeNumbers() {
        int[] arr = {-2, -3};
        assertEquals(6, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testAllNegativeNumbers() {
        int[] arr = {-2, -3, -4};
        assertEquals(12, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testSinglePositiveNumber() {
        int[] arr = {5};
        assertEquals(5, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testSingleNegativeNumber() {
        int[] arr = {-5};
        assertEquals(-5, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testContainsZero() {
        int[] arr = {-2, 0, -1};
        assertEquals(0, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testPositiveNumbers() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(24, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testZeroBetweenPositiveProducts() {
        int[] arr = {-2, 0, -1, 4};
        assertEquals(4, MaxProductSubArray.getMaxProductSubArray(arr));
    }

    @Test
    void testNegativePositiveNegative() {
        int[] arr = {-2, 3, -2};
        assertEquals(12, MaxProductSubArray.getMaxProductSubArray(arr));
    }
}
