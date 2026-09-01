package com.healthcare.arrays.slidingwindow;

import java.util.HashMap;
import java.util.Map;

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
