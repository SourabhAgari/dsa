package com.healthcare.arrays.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void returnsIndicesWhenPairIsAtBothEnds() {
        int[] numbers = {1, 3, 5, 7, 9};
        assertArrayEquals(new int[]{0, 4}, TwoSum.getTwoSumSorted(numbers, 10));
    }

    @Test
    void returnsIndicesWhenPairStartsAtFirstElement() {
        int[] numbers = {1, 4, 6, 8, 11};
        assertArrayEquals(new int[]{0, 1}, TwoSum.getTwoSumSorted(numbers, 5));
    }

    @Test
    void returnsDistinctIndicesForDuplicateValues() {
        int[] numbers = {1, 4, 4, 8, 10};
        assertArrayEquals(new int[]{1, 2}, TwoSum.getTwoSumSorted(numbers, 8));
    }

    @Test
    void findsPairInAnArrayContainingNegativeNumbers() {
        int[] numbers = {-8, -3, 0, 4, 9};
        assertArrayEquals(new int[]{0, 4}, TwoSum.getTwoSumSorted(numbers, 1));
    }

    @Test
    void returnsSentinelWhenNoPairMatchesTarget() {
        int[] numbers = {1, 3, 5, 7};
        assertArrayEquals(new int[]{0, 0}, TwoSum.getTwoSumSorted(numbers, 2));
    }

    @Test
    void returnsOriginalIndicesForAnUnsortedArray() {
        int[] numbers = {11, 2, 15, 7};
        assertArrayEquals(new int[]{1, 3}, TwoSum.getTwoSumUnSorted(numbers, 9));
    }

    @Test
    void findsPairWhenComplementAppearsBeforeCurrentElement() {
        int[] numbers = {3, 8, 12, 4};
        assertArrayEquals(new int[]{0, 2}, TwoSum.getTwoSumUnSorted(numbers, 15));
    }

    @Test
    void usesDifferentIndicesForDuplicateValuesInUnsortedArray() {
        int[] numbers = {5, 1, 5, 9};
        assertArrayEquals(new int[]{0, 2}, TwoSum.getTwoSumUnSorted(numbers, 10));
    }

    @Test
    void findsUnsortedPairWithNegativeNumbers() {
        int[] numbers = {4, -6, 10, 3};
        assertArrayEquals(new int[]{1, 2}, TwoSum.getTwoSumUnSorted(numbers, 4));
    }

    @Test
    void returnsEmptyArrayWhenUnsortedPairDoesNotExist() {
        int[] numbers = {1, 4, 8, 12};
        assertArrayEquals(new int[]{}, TwoSum.getTwoSumUnSorted(numbers, 6));
    }
}
