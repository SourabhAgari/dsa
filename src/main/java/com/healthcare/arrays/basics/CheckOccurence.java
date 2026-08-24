package com.healthcare.arrays.basics;

public class CheckOccurence {
    public static int checkOccurence(int[] arr,int ele) {
        int count = 0;
        for  (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele) count++;
        }
        return count;
    }
}
