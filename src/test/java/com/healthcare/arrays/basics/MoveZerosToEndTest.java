package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZerosToEndTest {
    @Test
    void movesAllZerosToTheEndWhilePreservingNonZeroOrder() {
        int[] numbers = {0, 1, 0, 3, 12};
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, MoveZerosToEnd.moveToEnd(numbers));
    }
    @Test
    void leavesAnArrayWithoutZerosUnchanged() {
        int[] numbers = {4, 2, 9};
        assertArrayEquals(new int[]{4, 2, 9}, MoveZerosToEnd.moveToEnd(numbers));
    }
    @Test
    void leavesAnAllZeroArrayUnchanged() {
        int[] numbers = {0, 0, 0};
        assertArrayEquals(new int[]{0, 0, 0}, MoveZerosToEnd.moveToEnd(numbers));
    }
}
