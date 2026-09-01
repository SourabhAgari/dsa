package com.healthcare.arrays.slidingwindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MaximumAvgSubArrayOneTest {
    @Test
    void returnsMaximumAverageForAWindowOfFour() {
        int[] numbers = {1, 12, -5, -6, 50, 3};
        assertEquals(12.75, MaximumAvgSubArrayOne.getMaxAvgSubArray(numbers, 4), 0.0001);
    }
    @Test
    void returnsAverageWhenAllValuesAreEqual() {
        int[] numbers = {5, 5, 5};
        assertEquals(5.0, MaximumAvgSubArrayOne.getMaxAvgSubArray(numbers, 2), 0.0001);
    }
    @Test
    void returnsMaximumAverageForNegativeValues() {
        int[] numbers = {-3, -2, -1};
        assertEquals(-1.5, MaximumAvgSubArrayOne.getMaxAvgSubArray(numbers, 2), 0.0001);
    }
    @Test
    void returnsValueForAWindowOfOne() {
        int[] numbers = {2, 7, 4};
        assertEquals(7.0, MaximumAvgSubArrayOne.getMaxAvgSubArray(numbers, 1), 0.0001);
    }
    @Test
    void returnsAverageWhenWindowMatchesArrayLength() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(2.5, MaximumAvgSubArrayOne.getMaxAvgSubArray(numbers, 4), 0.0001);
    }
}
