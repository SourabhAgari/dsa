package com.healthcare.arrays.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class TripletsWithSmallerSumTest {
    @Test
    void countsTripletsWithSumSmallerThanTarget() {
        int[] numbers = {-1, 0, 2, 3};
        assertEquals(2, TripletsWithSmallerSum.getTripletsWithSmallerSum(numbers, 3));
    }
    @Test
    void countsAllTripletsWhenEveryTripletIsSmallerThanTarget() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(4, TripletsWithSmallerSum.getTripletsWithSmallerSum(numbers, 100));
    }
    @Test
    void returnsZeroWhenNoTripletHasSmallerSum() {
        int[] numbers = {1, 2, 3};
        assertEquals(0, TripletsWithSmallerSum.getTripletsWithSmallerSum(numbers, 6));
    }
    @Test
    void countsTripletsContainingNegativeValues() {
        int[] numbers = {-3, -2, -1, 0};
        assertEquals(4, TripletsWithSmallerSum.getTripletsWithSmallerSum(numbers, 0));
    }
    @Test
    void countsCombinationsWhenValuesAreDuplicated() {
        int[] numbers = {1, 1, 1, 1};
        assertEquals(4, TripletsWithSmallerSum.getTripletsWithSmallerSum(numbers, 4));
    }
    @Test
    void returnsZeroForAnArrayWithFewerThanThreeValues() {
        int[] numbers = {1, 2};
        assertEquals(0, TripletsWithSmallerSum.getTripletsWithSmallerSum(numbers, 10));
    }
}
