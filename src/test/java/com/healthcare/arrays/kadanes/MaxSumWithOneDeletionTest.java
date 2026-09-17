package com.healthcare.arrays.kadanes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.healthcare.kadanes.MaxSumWithOneDeletion;
import org.junit.jupiter.api.Test;

class MaxSumWithOneDeletionTest {
    @Test
    void testExample1() {
        int[] arr = {1, -2, 0, 3};
        assertEquals(4, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testExample2() {
        int[] arr = {1, -2, -2, 3};
        assertEquals(3, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testAllNegativeNumbers() {
        int[] arr = {-1, -2, -3, -4};
        assertEquals(-1, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testAllPositiveNumbers() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(10, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        assertEquals(5, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testSingleNegativeElement() {
        int[] arr = {-5};
        assertEquals(-5, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testDeletionInMiddle() {
        int[] arr = {1, 2, -10, 3, 4};
        assertEquals(10, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testDeletionAtBeginning() {
        int[] arr = {-10, 2, 3, 4};
        assertEquals(9, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testDeletionAtEnd() {
        int[] arr = {2, 3, 4, -10};
        assertEquals(9, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }

    @Test
    void testZero() {
        int[] arr = {0, -1, 0, 3};
        assertEquals(3, MaxSumWithOneDeletion.getMaxSumWithOneDeletion(arr));
    }
}
