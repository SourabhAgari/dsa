package com.healthcare.arrays.prefixsum;

import java.util.HashMap;

public class SubArraySumDivisibleByK {
    public static int subArraySumDivisibleByKBrute(int[] arr,int k){
        int count = 0, n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];

                if(sum % k == 0) count++;
            }
        }
        return count;
    }

    public static int subArraySumDivisibleByKOptimal(int[] arr, int k){
        int count = 0, n = arr.length, prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum += arr[i];
            int remaining = prefixSum % k;
            if(remaining < 0){
                remaining = remaining + k;
            }

            if(map.containsKey(remaining)){
                count += map.get(remaining);
            }
            map.put(remaining,map.getOrDefault(remaining,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(SubArraySumDivisibleByK
                .subArraySumDivisibleByKOptimal(new int[]{4, 5, 0, -2, -3, 1},5));
    }
}
