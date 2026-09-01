package com.healthcare.arrays.slidingwindow;

/**
 * Problem Statement:
 *
 * Given an integer array arr and an integer k, find the contiguous
 * subarray of exactly k elements that has the maximum average value.
 *
 * Example:
 * arr = [1, 12, -5, -6, 50, 3]
 * k = 4
 *
 * Subarrays of size 4:
 * [1, 12, -5, -6]  -> average = 0.5
 * [12, -5, -6, 50] -> average = 12.75
 * [-5, -6, 50, 3]  -> average = 10.5
 *
 * Output:
 * 12.75
 *
 * Approach:
 * Use a fixed-size sliding window of size k.
 */
public class MaximumAvgSubArrayOne {
    public static double getMaxAvgSubArray(int[] arr,int k){
        int left = 0, right = k, sum = 0;
        int n = arr.length;
        double maxAverage = Double.NEGATIVE_INFINITY;
        for(int i = 0;i < k;i++){
            sum += arr[i];
        }

        maxAverage = Math.max(maxAverage,(double) sum/k);

        while(right < n) {
            sum -= arr[left];
            sum += arr[right];

            maxAverage = Math.max(maxAverage,(double) sum/k);

            left++;
            right++;
        }
        return maxAverage;
    }
}
