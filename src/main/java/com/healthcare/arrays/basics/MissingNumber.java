package com.healthcare.arrays.basics;

public class MissingNumber {
    public static int MissedNumber(int[] arr){
        int n = arr.length;
        int expected = (n * (n+1)) / 2;
        int actual = 0;
        for(int num: arr){
            actual += num;
        }
        return expected - actual;
    }
}
