package com.healthcare.arrays.basics;

public class EvenCount {
    public static int getEventCount(int[] arr) {
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
