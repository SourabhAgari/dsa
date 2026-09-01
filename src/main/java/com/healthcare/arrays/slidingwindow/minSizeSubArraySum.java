package com.healthcare.arrays.slidingwindow;

/**
 * Problem Statement:
 *
 * Given an array of positive integers arr and a positive integer target,
 * find the minimum length of a contiguous subarray whose sum is greater
 * than or equal to target.
 *
 * If no such subarray exists, return 0.
 *
 * Example:
 * arr = [2, 3, 1, 2, 4, 3]
 * target = 7
 *
 * Subarrays with sum >= 7:
 * [2, 3, 1, 2] -> sum = 8, length = 4
 * [3, 1, 2, 4] -> sum = 10, length = 4
 * [1, 2, 4]    -> sum = 7, length = 3
 * [4, 3]       -> sum = 7, length = 2
 *
 * Output:
 * 2
 *
 * Approach:
 * Use a variable-size sliding window.
 */
public class minSizeSubArraySum {
    public static int getMinSizeSubArraySum(int[] arr,int target){
        int left = 0, right = 0, sum = 0, minSum = Integer.MAX_VALUE;
        int n = arr.length;
        while(right < n){
            sum += arr[right];
            while (sum >= target) {
                minSum = Math.min(minSum,(right-left)+1);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return minSum == Integer.MAX_VALUE ? 0 :minSum;
    }
}
