package com.healthcare.arrays.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ThreeSumClosestTest {
    @Test
    void returnsExactTargetWhenATripletMatches() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(6, ThreeSumClosest.getThreeSumClosest(numbers, 6));
    }
    @Test
    void returnsClosestSumForAnUnsortedArray() {
        int[] numbers = {-1, 2, 1, -4};
        assertEquals(2, ThreeSumClosest.getThreeSumClosest(numbers, 1));
    }
    @Test
    void returnsTheSmallestPossibleSumWhenTargetIsBelowEveryTriplet() {
        int[] numbers = {1, 2, 4, 8, 16};
        assertEquals(7, ThreeSumClosest.getThreeSumClosest(numbers, -100));
    }
    @Test
    void returnsTheLargestPossibleSumWhenTargetIsAboveEveryTriplet() {
        int[] numbers = {-8, -3, 0, 4, 9};
        assertEquals(13, ThreeSumClosest.getThreeSumClosest(numbers, 100));
    }
    @Test
    void handlesDuplicateValues() {
        int[] numbers = {0, 0, 0, 1};
        assertEquals(1, ThreeSumClosest.getThreeSumClosest(numbers, 1));
    }
}
