package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DistinctSecLargestTest {
    @Test
    void returnsSecondLargestDistinctValueWhenLargestIsRepeated() {
        assertEquals(9, DistinctSecLargest.getSecLargestDistinct(new int[]{12, 5, 9, 12, 7}));
    }
    @Test
    void returnsSecondLargestDistinctValueForNegativeNumbers() {
        assertEquals(-7, DistinctSecLargest.getSecLargestDistinct(new int[]{-10, -3, -7, -3}));
    }
}
