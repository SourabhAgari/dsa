package com.healthcare.arrays.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MinimumWindowSortTest {
    @Test
    void returnsWindowLengthForAnUnsortedMiddleSection() {
        int[] numbers = {1, 2, 5, 3, 7, 10, 9, 12};
        assertEquals(5, MinimumWindowSort.minimumWindowSort(numbers));
    }
    @Test
    void returnsZeroForAnAlreadySortedArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(0, MinimumWindowSort.minimumWindowSort(numbers));
    }
    @Test
    void returnsEntireLengthForAReverseSortedArray() {
        int[] numbers = {5, 4, 3, 2, 1};
        assertEquals(5, MinimumWindowSort.minimumWindowSort(numbers));
    }
    @Test
    void expandsWindowWhenSmallestValueIsAtTheRightBoundary() {
        int[] numbers = {1, 2, 3, 5, 4, 0, 6, 7};
        assertEquals(6, MinimumWindowSort.minimumWindowSort(numbers));
    }
    @Test
    void expandsWindowWhenSmallestValueNeedsToMoveToTheBeginning() {
        int[] numbers = {1, 3, 2, 0, -1, 7, 10};
        assertEquals(5, MinimumWindowSort.minimumWindowSort(numbers));
    }
    @Test
    void returnsZeroForSortedArrayWithDuplicateValues() {
        int[] numbers = {1, 2, 2, 3, 3};
        assertEquals(0, MinimumWindowSort.minimumWindowSort(numbers));
    }
    @Test
    void returnsTwoForTwoValuesInDescendingOrder() {
        int[] numbers = {2, 1};
        assertEquals(2, MinimumWindowSort.minimumWindowSort(numbers));
    }
}
