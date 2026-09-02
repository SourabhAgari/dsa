package com.healthcare.arrays.slidingwindow;

import java.util.HashMap;
import java.util.Map;

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
