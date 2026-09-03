package com.healthcare.arrays.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinWindowSubStringTest {
    @Test
    void returnsSmallestWindowContainingAllRequiredCharacters() {
        assertEquals("BANC", MinWindowSubString.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void returnsSourceWhenItExactlyMatchesTarget() {
        assertEquals("a", MinWindowSubString.minWindow("a", "a"));
    }

    @Test
    void returnsEmptyStringWhenSourceCannotContainTarget() {
        assertEquals("", MinWindowSubString.minWindow("a", "aa"));
    }

    @Test
    void accountsForRepeatedCharactersInTarget() {
        assertEquals("AABBC", MinWindowSubString.minWindow("AAABBC", "AABC"));
    }

    @Test
    void returnsEmptyStringForAnEmptySource() {
        assertEquals("", MinWindowSubString.minWindow("", "ABC"));
    }

    @Test
    void returnsEmptyStringForAnEmptyTarget() {
        assertEquals("", MinWindowSubString.minWindow("ABC", ""));
    }
}
