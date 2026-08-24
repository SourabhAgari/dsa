package com.healthcare.arrays.basics;

public class DistinctSecLargest {
    public static int getSecLargestDistinct(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            if(arr[i] > secLargest && arr[i] < largest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
}
