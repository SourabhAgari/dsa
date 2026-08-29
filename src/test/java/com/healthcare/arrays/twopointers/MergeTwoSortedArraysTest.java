package com.healthcare.arrays.twopointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
class MergeTwoSortedArraysTest {
    @Test
    void mergesTwoSortedArrays() {
        int[] left = {1, 3, 5};
        int[] right = {2, 4, 6};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, MergeTwoSortedArrays.mergeTwoArrays(left, right, 3, 3));
    }
    @Test
    void mergesArraysContainingDuplicateValues() {
        int[] left = {1, 2, 2};
        int[] right = {2, 2, 3};
        assertArrayEquals(new int[]{1, 2, 2, 2, 2, 3}, MergeTwoSortedArrays.mergeTwoArrays(left, right, 3, 3));
    }
    @Test
    void mergesArraysContainingNegativeValues() {
        int[] left = {-5, -1, 4};
        int[] right = {-3, 0, 2};
        assertArrayEquals(new int[]{-5, -3, -1, 0, 2, 4}, MergeTwoSortedArrays.mergeTwoArrays(left, right, 3, 3));
    }
    @Test
    void returnsRightArrayWhenLeftArrayHasNoValuesToMerge() {
        int[] left = {};
        int[] right = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3}, MergeTwoSortedArrays.mergeTwoArrays(left, right, 0, 3));
    }
    @Test
    void returnsLeftArrayWhenRightArrayHasNoValuesToMerge() {
        int[] left = {1, 2, 3};
        int[] right = {};
        assertArrayEquals(new int[]{1, 2, 3}, MergeTwoSortedArrays.mergeTwoArrays(left, right, 3, 0));
    }
    @Test
    void mergesOnlyTheSpecifiedNumberOfValues() {
        int[] left = {1, 4, 7, 99};
        int[] right = {2, 3, 8, 99};
        assertArrayEquals(new int[]{1, 2, 3, 4, 7, 8}, MergeTwoSortedArrays.mergeTwoArrays(left, right, 3, 3));
    }
    @Test
    void mergesTwoSortedArraysInPlace() {
        int[] left = {1, 3, 5, 0, 0, 0};
        int[] right = {2, 4, 6};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, MergeTwoSortedArrays.mergeTwoArraysInPlace(left, right, 3, 3));
    }
    @Test
    void mergesInPlaceWhenEveryRightValueComesFirst() {
        int[] left = {4, 5, 6, 0, 0, 0};
        int[] right = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, MergeTwoSortedArrays.mergeTwoArraysInPlace(left, right, 3, 3));
    }
    @Test
    void mergesDuplicateValuesInPlace() {
        int[] left = {1, 2, 2, 0, 0, 0};
        int[] right = {2, 2, 3};
        assertArrayEquals(new int[]{1, 2, 2, 2, 2, 3}, MergeTwoSortedArrays.mergeTwoArraysInPlace(left, right, 3, 3));
    }
    @Test
    void copiesRightArrayWhenLeftHasNoValuesInPlace() {
        int[] left = {0, 0, 0};
        int[] right = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3}, MergeTwoSortedArrays.mergeTwoArraysInPlace(left, right, 0, 3));
    }
    @Test
    void leavesLeftUnchangedWhenRightHasNoValuesInPlace() {
        int[] left = {1, 2, 3};
        int[] right = {};
        assertArrayEquals(new int[]{1, 2, 3}, MergeTwoSortedArrays.mergeTwoArraysInPlace(left, right, 3, 0));
    }
}
