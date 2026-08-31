package com.healthcare.arrays.slidingwindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class minSizeSubArraySumTest {
    @Test
    void returnsMinimumLengthForASubArrayMeetingTarget() {
        int[] numbers = {2, 3, 1, 2, 4, 3};
        assertEquals(2, minSizeSubArraySum.getMinSizeSubArraySum(numbers, 7));
    }
    @Test
    void returnsOneWhenASingleValueMeetsTarget() {
        int[] numbers = {1, 4, 4};
        assertEquals(1, minSizeSubArraySum.getMinSizeSubArraySum(numbers, 4));
    }
    @Test
    void returnsEntireLengthWhenOnlyEntireArrayMeetsTarget() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(5, minSizeSubArraySum.getMinSizeSubArraySum(numbers, 15));
    }
    @Test
    void returnsZeroWhenNoSubArrayMeetsTarget() {
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(0, minSizeSubArraySum.getMinSizeSubArraySum(numbers, 11));
    }
    @Test
    void returnsZeroForAnEmptyArray() {
        int[] numbers = {};
        assertEquals(0, minSizeSubArraySum.getMinSizeSubArraySum(numbers, 5));
    }
    @Test
    void handlesRepeatedValues() {
        int[] numbers = {1, 1, 1};
        assertEquals(3, minSizeSubArraySum.getMinSizeSubArraySum(numbers, 3));
    }
}
