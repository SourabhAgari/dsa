package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void returnsSumOfAllArrayElements() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals(Sum.getSum(arr),45);
    }

    public void returnsZeroForEmptyArray() {
        assertEquals(Sum.getSum(new int[0]),0);
    }
}
