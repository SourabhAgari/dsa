package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class RemoveDuplicatesTest {
    @Test
    void movesDistinctValuesToTheBeginningOfASortedArray() {
        int[] numbers = {1, 1, 2, 2, 3, 3};
        int[] result = RemoveDuplicates.DuplicatesRemoved(numbers);
        assertSame(numbers, result);
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{result[0], result[1], result[2]});
    }

    @Test
    void leavesAnArrayWithOnlyDistinctValuesUnchanged() {
        int[] numbers = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3}, RemoveDuplicates.DuplicatesRemoved(numbers));
    }

    @Test
    void handlesAnEmptyArray() {
        assertArrayEquals(new int[]{}, RemoveDuplicates.DuplicatesRemoved(new int[]{}));
    }

    @Test
    void handlesAnArrayContainingOnlyOneRepeatedValue() {
        int[] numbers = {5, 5, 5};
        int[] result = RemoveDuplicates.DuplicatesRemoved(numbers);
        assertArrayEquals(new int[]{5}, new int[]{result[0]});
    }
}
