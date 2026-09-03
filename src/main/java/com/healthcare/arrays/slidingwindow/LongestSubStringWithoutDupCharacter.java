package com.healthcare.arrays.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement:
 *
 * Given an integer array arr, find the length of the longest contiguous
 * subarray that contains no duplicate elements.
 *
 * Example:
 * arr = [1, 2, 3, 1, 2, 3]
 *
 * Contiguous subarrays without duplicate elements include:
 * [1, 2, 3] -> length = 3
 * [2, 3, 1] -> length = 3
 * [3, 1, 2] -> length = 3
 *
 * Output:
 * 3
 *
 * Approach:
 * Use a variable-size sliding window and a HashMap to track the frequency
 * of each element in the current window. When a duplicate is present,
 * shrink the window from the left until all elements are distinct.
 */
public class LongestSubStringWithoutDupCharacter {
    public static int getLongestSubStringWithoutDupCharacter(int[] arr){
        int left = 0, max = Integer.MIN_VALUE;
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int right=0; right < n;right++){
            map.put(arr[right], map.getOrDefault(arr[right],0)+1);
            while (map.size() < right -left+1){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }

            if(map.size() == right-left+1){
                max = Math.max(max,right-left+1);
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
