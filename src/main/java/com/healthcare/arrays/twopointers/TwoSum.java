package com.healthcare.arrays.twopointers;

import java.util.HashMap;

public class TwoSum {
    public static int[] getTwoSumSorted(int[] arr,int target) {
        int i = 0, j = arr.length - 1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target) return new int[]{i,j};
            else if(sum > target) j--;
            else i++;
        }
        return new int[]{0,0};
    }

    public static int[] getTwoSumUnSorted(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int required = target-arr[i];
            if(map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
