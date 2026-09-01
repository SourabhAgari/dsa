package com.healthcare.arrays.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement:
 *
 * Given an integer array arr and an integer k, find the length of the
 * longest contiguous subarray that contains exactly k distinct elements.
 *
 * Example:
 * arr = [1, 2, 1, 2, 3]
 * k = 2
 *
 * Subarrays with exactly 2 distinct elements:
 * [1, 2]       -> length = 2
 * [1, 2, 1]    -> length = 3
 * [1, 2, 1, 2] -> length = 4
 * [2, 1, 2]    -> length = 3
 * [1, 2]       -> length = 2
 *
 * Output:
 * 4
 *
 * Approach:
 * Use a variable-size sliding window with a HashMap to keep track
 * of the frequency of each element in the current window.
 *
 * Slight variation - atmost (<=) and atleast(>=) can be solved
 */
public class longestSubarrayWithKDistinct {
    public static int getLongestSubarrayWithKDistinct(int[] arr, int k){
        int left = 0, maxSum = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int right = 0; right < arr.length; right++) {
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while (map.size() > k){
                map.put(arr[left], map.get(arr[left])-1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            if(map.size() == k){
                maxSum = Math.max(maxSum,right-left+1);
            }
        }
        return maxSum == Integer.MIN_VALUE ? 0 : maxSum;
    }
}
