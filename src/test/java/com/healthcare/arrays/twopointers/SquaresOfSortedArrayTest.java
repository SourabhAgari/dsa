package com.healthcare.arrays.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
class SquaresOfSortedArrayTest {
    @Test
    void returnsSortedSquaresForNegativeAndPositiveNumbers() {
        int[] numbers = {-4, -1, 0, 3, 10};
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, SquaresOfSortedArray.getSquares(numbers));
    }
    @Test
    void returnsSortedSquaresForOnlyNegativeNumbers() {
        int[] numbers = {-7, -3, -1};
        assertArrayEquals(new int[]{1, 9, 49}, SquaresOfSortedArray.getSquares(numbers));
    }
    @Test
    void returnsSortedSquaresForOnlyPositiveNumbers() {
        int[] numbers = {1, 2, 3};
        assertArrayEquals(new int[]{1, 4, 9}, SquaresOfSortedArray.getSquares(numbers));
    }
    @Test
    void returnsSquareForASingleNumber() {
        int[] numbers = {5};
        assertArrayEquals(new int[]{25}, SquaresOfSortedArray.getSquares(numbers));
    }
    @Test
    void returnsAnEmptyArrayForEmptyInput() {
        int[] numbers = {};
        assertArrayEquals(new int[]{}, SquaresOfSortedArray.getSquares(numbers));
    }
    @Test
    void handlesDuplicateValues() {
        int[] numbers = {-2, -2, 0, 2};
        assertArrayEquals(new int[]{0, 4, 4, 4}, SquaresOfSortedArray.getSquares(numbers));
    }
}
