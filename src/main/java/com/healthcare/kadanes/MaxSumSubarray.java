package com.healthcare.kadanes;

public class MaxSumSubarray {
    public static int getMaxSum(int[] arr){
        int bestFinding = arr[0];
        int maxSum = arr[0];

        for(int i=1;i<arr.length;i++){
            bestFinding = Math.max(arr[i],bestFinding+arr[i]);
            maxSum = Math.max(bestFinding,maxSum);
        }
        return maxSum;
    }
}
