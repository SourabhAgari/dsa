package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveDuplicatesTest {
    @Test
    void packsDistinctValuesIntoTheFrontOfASortedArray() {
        int[] numbers = {1, 1, 2, 2, 3, 3};
        assertArrayEquals(new int[]{1, 2, 3, 2, 1, 3}, RemoveDuplicates.DuplicatesRemoved(numbers));
    }
    @Test
    void leavesAnArrayOfDistinctValuesUnchanged() {
        int[] numbers = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3}, RemoveDuplicates.DuplicatesRemoved(numbers));
    }
    @Test
    void leavesAnArrayOfOneRepeatedValueUnchanged() {
        int[] numbers = {5, 5, 5};
        assertArrayEquals(new int[]{5, 5, 5}, RemoveDuplicates.DuplicatesRemoved(numbers));
    }
    @Test
    void leavesTrailingCopiesBehindTheDistinctPrefix() {
        int[] numbers = {1, 1, 1, 2};
        assertArrayEquals(new int[]{1, 2, 1, 1}, RemoveDuplicates.DuplicatesRemoved(numbers));
    }
    @Test
    void handlesNegativeValues() {
        int[] numbers = {-5, -5, -1, 0};
        assertArrayEquals(new int[]{-5, -1, 0, -5}, RemoveDuplicates.DuplicatesRemoved(numbers));
    }
    @Test
    void handlesASingleElementArray() {
        int[] numbers = {7};
        assertArrayEquals(new int[]{7}, RemoveDuplicates.DuplicatesRemoved(numbers));
    }
    @Test
    void handlesAnEmptyArray() {
        assertArrayEquals(new int[]{}, RemoveDuplicates.DuplicatesRemoved(new int[]{}));
    }
}
