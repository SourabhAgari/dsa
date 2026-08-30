package com.healthcare.arrays.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
class SortColorsTest {
    @Test
    void sortsMixedColors() {
        int[] colors = {2, 0, 2, 1, 1, 0};
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, SortColors.sortColors(colors));
    }
    @Test
    void leavesAlreadySortedColorsUnchanged() {
        int[] colors = {0, 0, 1, 1, 2, 2};
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, SortColors.sortColors(colors));
    }
    @Test
    void sortsColorsInReverseOrder() {
        int[] colors = {2, 2, 1, 1, 0, 0};
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, SortColors.sortColors(colors));
    }
    @Test
    void handlesAnArrayContainingOnlyOneColor() {
        int[] colors = {1, 1, 1};
        assertArrayEquals(new int[]{1, 1, 1}, SortColors.sortColors(colors));
    }
    @Test
    void handlesASingleColor() {
        int[] colors = {2};
        assertArrayEquals(new int[]{2}, SortColors.sortColors(colors));
    }
    @Test
    void handlesAnEmptyArray() {
        int[] colors = {};
        assertArrayEquals(new int[]{}, SortColors.sortColors(colors));
    }
}
