package com.healthcare.arrays.slidingwindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class longestSubarrayWithKDistinctTest {
    @Test
    void returnsLongestSubarrayWithTwoDistinctValues() {
        int[] numbers = {1, 2, 1, 2, 3};
        assertEquals(4, longestSubarrayWithKDistinct.getLongestSubarrayWithKDistinct(numbers, 2));
    }
    @Test
    void returnsLongestSubarrayWithThreeDistinctValues() {
        int[] numbers = {1, 2, 1, 3, 4, 2, 3};
        assertEquals(4, longestSubarrayWithKDistinct.getLongestSubarrayWithKDistinct(numbers, 3));
    }
    @Test
    void returnsEntireLengthWhenOnlyOneDistinctValueExists() {
        int[] numbers = {4, 4, 4};
        assertEquals(3, longestSubarrayWithKDistinct.getLongestSubarrayWithKDistinct(numbers, 1));
    }
    @Test
    void handlesNegativeValues() {
        int[] numbers = {-1, -1, 2, 2, 3};
        assertEquals(4, longestSubarrayWithKDistinct.getLongestSubarrayWithKDistinct(numbers, 2));
    }
    @Test
    void returnsZeroWhenArrayHasFewerDistinctValuesThanK() {
        int[] numbers = {1, 1, 2};
        assertEquals(0, longestSubarrayWithKDistinct.getLongestSubarrayWithKDistinct(numbers, 3));
    }
    @Test
    void returnsZeroForAnEmptyArray() {
        int[] numbers = {};
        assertEquals(0, longestSubarrayWithKDistinct.getLongestSubarrayWithKDistinct(numbers, 1));
    }
}
