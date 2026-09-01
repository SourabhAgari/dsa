package com.healthcare.arrays.slidingwindow;

/**
 * Problem Statement:
 *
 * Given an integer array arr and an integer k, find the maximum sum
 * of any contiguous subarray of exactly k elements.
 *
 * Example:
 * arr = [2, 1, 5, 1, 3, 2]
 * k = 3
 *
 * Subarrays of size 3:
 * [2, 1, 5] -> sum = 8
 * [1, 5, 1] -> sum = 7
 * [5, 1, 3] -> sum = 9
 * [1, 3, 2] -> sum = 6
 *
 * Output:
 * 9
 *
 * Approach:
 * Use a fixed-size sliding window of size k.
 */
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

    public static int getMaxSubArrayTwo(int[] arr, int k){
        int maxSum = Integer.MIN_VALUE, sum = 0;
        int n = arr.length;
        int left = 0, right = k;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }

        maxSum = Math.max(maxSum, sum);

        while(right < n){
            sum -= arr[left];
            sum += arr[right];

            maxSum = Math.max(maxSum,sum);

            left++;
            right++;
        }
        return maxSum;
    }
}
