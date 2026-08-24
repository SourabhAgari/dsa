package com.healthcare.arrays.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenCountTest {

    @Test
    public void evenCountForThreeEvenElements() {
        int[] arr = new int[] {1,2,3,4,5,6};
        assertEquals(EvenCount.getEventCount(arr),3);
    }

    @Test
    public void zeroCountForZeroElements() {
        int[] arr = new int[] {};
        assertEquals(EvenCount.getEventCount(arr),0);
    }
}
