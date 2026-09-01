package com.healthcare.arrays.slidingwindow;

import java.util.HashMap;
import java.util.Map;

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
