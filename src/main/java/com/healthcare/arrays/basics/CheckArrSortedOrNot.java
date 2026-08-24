package com.healthcare.arrays.basics;

public class CheckArrSortedOrNot {
    public static boolean CheckSortedOrNot(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
