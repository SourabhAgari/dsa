package com.healthcare.arrays.basics;

public class FirstOccurenceIndex {
    public static int getFirstOccurenceIndex(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele) {
                return i;
            }
        }
        return 0;
    }
}
