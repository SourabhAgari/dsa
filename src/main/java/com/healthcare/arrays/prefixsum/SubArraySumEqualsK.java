package com.healthcare.arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static int getSubArraySumEqualsKBrute(int[] arr,int k){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++) {
                sum += arr[j];
                if(sum == k)  count++;
            }
        }
        return count;
    }

    public static int getSubArraySumEqualsKBetter(int[] arr, int k){
        int n = arr.length, prefixSum = 0, count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(getSubArraySumEqualsKBetter(new int[]{1,2,3},3));
    }
}
