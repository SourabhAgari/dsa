package com.healthcare.arrays.slidingwindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class FruitsIntoBasketTest {
    @Test
    void returnsEntireLengthWhenOnlyTwoFruitTypesExist() {
        int[] fruits = {1, 2, 1};
        assertEquals(3, FruitsIntoBasket.getFruitsIntoBasket(fruits));
    }
    @Test
    void returnsLongestSequenceContainingTwoFruitTypes() {
        int[] fruits = {0, 1, 2, 2};
        assertEquals(3, FruitsIntoBasket.getFruitsIntoBasket(fruits));
    }
    @Test
    void findsLongestSequenceAfterRemovingEarlierFruitType() {
        int[] fruits = {1, 2, 3, 2, 2};
        assertEquals(4, FruitsIntoBasket.getFruitsIntoBasket(fruits));
    }
    @Test
    void returnsEntireLengthWhenAllFruitsHaveSameType() {
        int[] fruits = {5, 5, 5, 5};
        assertEquals(4, FruitsIntoBasket.getFruitsIntoBasket(fruits));
    }
    @Test
    void handlesNegativeFruitTypeValues() {
        int[] fruits = {-1, -1, 2, 2, 3};
        assertEquals(4, FruitsIntoBasket.getFruitsIntoBasket(fruits));
    }
    @Test
    void returnsZeroForAnEmptyArray() {
        int[] fruits = {};
        assertEquals(0, FruitsIntoBasket.getFruitsIntoBasket(fruits));
    }
}
