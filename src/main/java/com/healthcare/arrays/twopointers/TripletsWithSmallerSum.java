package com.healthcare.arrays.twopointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {
    public static int getTripletsWithSmallerSum(int[] arr,int target){
        Arrays.sort(arr);
        int minCount = 0;
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum >= target) right--;
                else {
                    minCount = minCount + right-left;
                    left++;
                }
            }
        }
        return minCount;
    }
}
