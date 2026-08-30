package com.healthcare.arrays.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class LongestMountainTest {
    @Test
    void returnsLengthOfTheLongestMountain() {
        int[] numbers = {2, 1, 4, 7, 3, 2, 5};
        assertEquals(5, LongestMountain.getLongestMountain(numbers));
    }
    @Test
    void returnsEntireLengthWhenArrayIsOneMountain() {
        int[] numbers = {0, 1, 2, 3, 2, 1, 0};
        assertEquals(7, LongestMountain.getLongestMountain(numbers));
    }
    @Test
    void returnsZeroForAnAscendingArray() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(0, LongestMountain.getLongestMountain(numbers));
    }
    @Test
    void returnsZeroForADescendingArray() {
        int[] numbers = {4, 3, 2, 1};
        assertEquals(0, LongestMountain.getLongestMountain(numbers));
    }
    @Test
    void returnsZeroWhenPeakHasEqualAdjacentValues() {
        int[] numbers = {1, 2, 2, 1};
        assertEquals(0, LongestMountain.getLongestMountain(numbers));
    }
    @Test
    void returnsZeroForAnArrayWithFewerThanThreeValues() {
        int[] numbers = {1, 2};
        assertEquals(0, LongestMountain.getLongestMountain(numbers));
    }
}
