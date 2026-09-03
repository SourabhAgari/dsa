package com.healthcare.arrays.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement:
 *
 * Given an integer array fruits, where each value represents a fruit type,
 * find the maximum number of fruits that can be collected from a contiguous
 * subarray containing at most two distinct fruit types.
 *
 * Example:
 * fruits = [1, 2, 3, 2, 2]
 *
 * Valid contiguous subarrays with at most 2 fruit types include:
 * [1, 2]       -> length = 2
 * [2, 3, 2, 2] -> length = 4
 *
 * Output:
 * 4
 *
 * Approach:
 * Use a variable-size sliding window and a HashMap to track the frequency
 * of each fruit type in the current window. When the window contains more
 * than two fruit types, shrink it from the left until it is valid again.
 */
public class FruitsIntoBasket {
    public static int getFruitsIntoBasket(int[] fruits){
        int left = 0, max = Integer.MIN_VALUE, n = fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right < n; right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size() > 2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }

            if(map.size() <= 2){
                max = Math.max(max,right-left+1);
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
