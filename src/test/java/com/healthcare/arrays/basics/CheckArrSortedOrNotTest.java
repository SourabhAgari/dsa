package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
class CheckArrSortedOrNotTest {
    @Test
    void returnsTrueForAnAscendingArray() {
        assertTrue(CheckArrSortedOrNot.CheckSortedOrNot(new int[]{1, 2, 3, 4}));
    }
    @Test
    void returnsTrueWhenEqualValuesAreAdjacent() {
        assertTrue(CheckArrSortedOrNot.CheckSortedOrNot(new int[]{1, 2, 2, 5}));
    }
    @Test
    void returnsFalseWhenLaterElementsAreOutOfOrder() {
        assertFalse(CheckArrSortedOrNot.CheckSortedOrNot(new int[]{1, 3, 2, 4}));
    }
    @Test
    void returnsTrueForAnEmptyArray() {
        assertTrue(CheckArrSortedOrNot.CheckSortedOrNot(new int[]{}));
    }
}
