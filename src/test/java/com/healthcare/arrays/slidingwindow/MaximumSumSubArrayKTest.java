package com.healthcare.arrays.slidingwindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MaximumSumSubArrayKTest {
    @Test
    void returnsMaximumSumForAWindowOfThree() {
        int[] numbers = {2, 1, 5, 1, 3, 2};
        assertEquals(9, MaximumSumSubArrayK.getMaxSubArray(numbers, 3));
    }
    @Test
    void returnsLargestValueForAWindowOfOne() {
        int[] numbers = {2, -1, 5, 1};
        assertEquals(5, MaximumSumSubArrayK.getMaxSubArray(numbers, 1));
    }
    @Test
    void handlesAnArrayContainingOnlyNegativeValues() {
        int[] numbers = {-2, -3, -1, -4};
        assertEquals(-4, MaximumSumSubArrayK.getMaxSubArray(numbers, 2));
    }
    @Test
    void returnsTotalWhenWindowMatchesArrayLength() {
        int[] numbers = {1, 2, 3};
        assertEquals(6, MaximumSumSubArrayK.getMaxSubArray(numbers, 3));
    }
    @Test
    void findsMaximumAcrossOverlappingWindows() {
        int[] numbers = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        assertEquals(39, MaximumSumSubArrayK.getMaxSubArray(numbers, 4));
    }
}
