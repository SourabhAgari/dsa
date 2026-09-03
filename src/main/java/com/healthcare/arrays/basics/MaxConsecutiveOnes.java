package com.healthcare.arrays.basics;

public class MaxConsecutiveOnes {
    public static int getMaxConsecutiveOnes(int[] arr){
        int currentLength = 0, maxLength = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                currentLength = 0;
            }
            currentLength++;
            maxLength = Math.max(maxLength,currentLength);
        }
        return maxLength;
    }
}
