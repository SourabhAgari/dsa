package com.healthcare.arrays.slidingwindow;

public class LongestContinuosIncreasingSubsequence {
    public static int getLongestIncreasingSubsequence(int[] arr){
        int left = 0, maxLen = Integer.MIN_VALUE;
        for(int right=1;right<arr.length;right++){
            if(arr[right] <= arr[right-1]){
                left = right;
            }
            else {
                maxLen = Math.max(maxLen,right-left+1);
            }
        }
        return maxLen == Integer.MIN_VALUE ? 1 : maxLen;
    }
}
