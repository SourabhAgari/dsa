package com.healthcare.arrays.prefixsum;

public class PivotIndex {
    public static int getPivotIndexBrute(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int prefixSum = 0;
            for(int j=0;j<i;j++){
                prefixSum += arr[j];
            }
            int suffixSum = 0;
            for(int k=i+1;k<n;k++){
                suffixSum += arr[k];
            }
            if(prefixSum == suffixSum) return i;
        }
        return -1;
    }

    public static int getPivotIndexOptimal(int[] arr){
        int totalSum = 0, n = arr.length, left = 0;
        for(int i=0;i<n;i++){
            totalSum += arr[i];
        }
        for(int i=0;i<n;i++){
            if(left == totalSum - left - arr[i]) return i;
            left+=arr[i];
        }
        return -1;
    }
}
