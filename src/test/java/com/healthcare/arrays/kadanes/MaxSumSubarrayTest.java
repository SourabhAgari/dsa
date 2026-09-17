package com.healthcare.arrays.kadanes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.healthcare.kadanes.MaxSumSubarray;
import org.junit.jupiter.api.Test;

class MaxSumSubarrayTest {

    @Test
    void testPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, MaxSumSubarray.getMaxSum(arr));
    }

    @Test
    void testMixedNumbers() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, MaxSumSubarray.getMaxSum(arr));
    }

    @Test
    void testAllNegativeNumbers() {
        int[] arr = {-5, -2, -8, -1, -3};
        assertEquals(-1, MaxSumSubarray.getMaxSum(arr));
    }

    @Test
    void testSingleElement() {
        int[] arr = {7};
        assertEquals(7, MaxSumSubarray.getMaxSum(arr));
    }

    @Test
    void testSingleNegativeElement() {
        int[] arr = {-7};
        assertEquals(-7, MaxSumSubarray.getMaxSum(arr));
    }

    @Test
    void testZeroes() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(0, MaxSumSubarray.getMaxSum(arr));
    }

    @Test
    void testPositiveSubarrayInMiddle() {
        int[] arr = {-5, -2, 4, 6, -3, -1};
        assertEquals(10, MaxSumSubarray.getMaxSum(arr));
    }

    @Test
    void testNegativePrefix() {
        int[] arr = {-10, -5, 2, 3, 4};
        assertEquals(9, MaxSumSubarray.getMaxSum(arr));
    }
}