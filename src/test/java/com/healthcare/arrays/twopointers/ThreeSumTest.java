package com.healthcare.arrays.twopointers;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {
    @Test
    void findsAllUniqueTriplets() {
        int[] numbers = {-1, 0, 1, 2, -1, -4};
        assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), ThreeSum.getThreeSum(numbers));
    }
    @Test
    void returnsOneTripletForAllZeroValues() {
        int[] numbers = {0, 0, 0, 0};
        assertEquals(List.of(List.of(0, 0, 0)), ThreeSum.getThreeSum(numbers));
    }
    @Test
    void returnsEmptyListWhenNoTripletExists() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(List.of(), ThreeSum.getThreeSum(numbers));
    }
    @Test
    void returnsEmptyListForArraysWithFewerThanThreeValues() {
        int[] numbers = {-1, 1};
        assertEquals(List.of(), ThreeSum.getThreeSum(numbers));
    }
    @Test
    void doesNotReuseTheSameArrayElement() {
        int[] numbers = {-2, 1, 4};
        assertEquals(List.of(), ThreeSum.getThreeSum(numbers));
    }
    @Test
    void findsTripletContainingNegativeAndPositiveValues() {
        int[] numbers = {2, -3, 1, 5, 7};
        assertEquals(List.of(List.of(-3, 1, 2)), ThreeSum.getThreeSum(numbers));
    }
}
