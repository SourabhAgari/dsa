package com.healthcare.arrays.kadanes;

import com.healthcare.kadanes.MaxSubarraySumCircular;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class maxSubArraySumCircularTest {
    @Test
    void testNormalMaximumSubarray() {
        int[] arr = {1, -2, 3, -2};
        int result = MaxSubarraySumCircular.getMaxSubarraySumCircular(arr);
        assertEquals(3, result);
    }

    @Test
    void testCircularMaximumSubarray() {
        int[] arr = {5, -3, 5};
        int result = MaxSubarraySumCircular.getMaxSubarraySumCircular(arr);
        assertEquals(10, result);
    }

    @Test
    void testAllNegative() {
        int[] arr = {-3, -2, -3};
        int result = MaxSubarraySumCircular.getMaxSubarraySumCircular(arr);
        assertEquals(-2, result);
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        int result = MaxSubarraySumCircular.getMaxSubarraySumCircular(arr);
        assertEquals(5, result);
    }

    @Test
    void testAllPositive() {
        int[] arr = {3, 4, 5};
        int result = MaxSubarraySumCircular.getMaxSubarraySumCircular(arr);
        assertEquals(12, result);
    }

    @Test
    void testWithZero() {
        int[] arr = {0, -2, 0};
        int result = MaxSubarraySumCircular.getMaxSubarraySumCircular(arr);
        assertEquals(0, result);
    }

    @Test
    void testCircularCase() {
        int[] arr = {8, -1, -3, 4};
        int result = MaxSubarraySumCircular.getMaxSubarraySumCircular(arr);
        assertEquals(12, result);
    }

    @Test
    void testNormalCaseBeatsCircularCase() {
        int[] arr = {-2, 5, -1};
        int result = MaxSubarraySumCircular.getMaxSubarraySumCircular(arr);
        assertEquals(5, result);
    }
}
