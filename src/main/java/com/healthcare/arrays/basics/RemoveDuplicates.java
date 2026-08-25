package com.healthcare.arrays.basics;

import com.healthcare.arrays.utils.Utils;

public class RemoveDuplicates {
    public static int[] DuplicatesRemoved(int[] arr){
        int i=0, j=1;
        while(j < arr.length){
            if(arr[i] == arr[j] || arr[j] < arr[i]) j++;
            else {
                i++;
                Utils.swap(arr,i,j);
                j++;
            }
        }
        return arr;
    }
}
