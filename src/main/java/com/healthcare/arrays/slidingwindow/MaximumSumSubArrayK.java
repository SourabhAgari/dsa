package com.healthcare.arrays.slidingwindow;

public class MaximumSumSubArrayK {
    public static int getMaxSubArray(int[] arr,int k){
        int maxSum = Integer.MIN_VALUE, sum = 0;
        int n = arr.length;
        int left = 0, right = k-1;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        while(right < n){
            maxSum = Math.max(maxSum,sum);

            left++;
            right++;

            if(right == n) break;

            sum -= arr[left-1];
            sum += arr[right];
        }
        return maxSum;
    }
}
