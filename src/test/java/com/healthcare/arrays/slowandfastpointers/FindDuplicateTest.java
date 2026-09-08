package com.healthcare.arrays.slowandfastpointers;

import com.healthcare.linkedlists.slowandfastpointers.FindDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindDuplicateTest {
    @Test
    void findsDuplicateInTheMiddleOfTheArray() {
        int[] numbers = {1, 3, 4, 2, 2};

        assertEquals(2, FindDuplicate.findDuplicate(numbers));
    }

    @Test
    void findsDuplicateNearTheBeginningOfTheArray() {
        int[] numbers = {3, 1, 3, 4, 2};

        assertEquals(3, FindDuplicate.findDuplicate(numbers));
    }

    @Test
    void findsDuplicateInTheSmallestValidArray() {
        int[] numbers = {1, 1};

        assertEquals(1, FindDuplicate.findDuplicate(numbers));
    }

    @Test
    void findsDuplicateWhenItAppearsMoreThanTwice() {
        int[] numbers = {2, 2, 2, 2, 2};

        assertEquals(2, FindDuplicate.findDuplicate(numbers));
    }

    @Test
    void findsDuplicateAtTheLargestValue() {
        int[] numbers = {1, 4, 4, 2, 3};

        assertEquals(4, FindDuplicate.findDuplicate(numbers));
    }
}
