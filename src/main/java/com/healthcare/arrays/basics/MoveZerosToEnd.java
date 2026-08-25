package com.healthcare.arrays.basics;

import com.healthcare.arrays.utils.Utils;

public class MoveZerosToEnd {
    public static int[] moveToEnd(int[] arr){
        int i=0,j=0;
        while(j < arr.length){
            if(arr[j] == 0) j++;
            else {
                Utils.swap(arr,i,j);
                i++;
                j++;
            }

        }
        return arr;
    }
}
