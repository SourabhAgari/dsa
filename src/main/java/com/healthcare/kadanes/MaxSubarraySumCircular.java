package com.healthcare.kadanes;

public class MaxSubarraySumCircular {
    public static int getMaxSubarraySumCircular(int[] arr){
        int maxSum = arr[0];
        int minSum = arr[0];
        int totalSum = arr[0];
        for(int i=1;i<arr.length;i++){
            totalSum += arr[i];
            maxSum = Math.max(maxSum,Math.max(maxSum+arr[i],arr[i]));
            minSum = Math.min(minSum,Math.min(minSum+arr[i], arr[i]));
        }
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum,totalSum-minSum);
    }
}
