package com.healthcare.arrays.slidingwindow;

public class minSizeSubArraySum {
    public static int getMinSizeSubArraySum(int[] arr,int target){
        int left = 0, right = 0, sum = 0, minSum = Integer.MAX_VALUE;
        int n = arr.length;
        while(right < n){
            sum += arr[right];
            while (sum >= target) {
                minSum = Math.min(minSum,(right-left)+1);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return minSum == Integer.MAX_VALUE ? 0 :minSum;
    }
}
