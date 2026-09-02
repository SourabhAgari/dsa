package com.healthcare.arrays.slidingwindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class LongestSubStringWithoutDupCharacterTest {
    @Test
    void returnsLongestSequenceWithoutDuplicateValues() {
        int[] numbers = {1, 2, 3, 1, 2, 3};
        assertEquals(3, LongestSubStringWithoutDupCharacter.getLongestSubStringWithoutDupCharacter(numbers));
    }
    @Test
    void returnsOneWhenEveryValueIsTheSame() {
        int[] numbers = {1, 1, 1, 1};
        assertEquals(1, LongestSubStringWithoutDupCharacter.getLongestSubStringWithoutDupCharacter(numbers));
    }
    @Test
    void returnsEntireLengthWhenAllValuesAreDistinct() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(4, LongestSubStringWithoutDupCharacter.getLongestSubStringWithoutDupCharacter(numbers));
    }
    @Test
    void findsLongestSequenceAfterRemovingDuplicates() {
        int[] numbers = {1, 2, 1, 3, 4, 3, 5};
        assertEquals(4, LongestSubStringWithoutDupCharacter.getLongestSubStringWithoutDupCharacter(numbers));
    }
    @Test
    void handlesNegativeValues() {
        int[] numbers = {-1, -2, -1, -3};
        assertEquals(3, LongestSubStringWithoutDupCharacter.getLongestSubStringWithoutDupCharacter(numbers));
    }
    @Test
    void returnsZeroForAnEmptyArray() {
        int[] numbers = {};
        assertEquals(0, LongestSubStringWithoutDupCharacter.getLongestSubStringWithoutDupCharacter(numbers));
    }
}
