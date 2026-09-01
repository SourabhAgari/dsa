package com.healthcare.arrays.slidingwindow;

public class MaximumAvgSubArrayOne {
    public static double getMaxAvgSubArray(int[] arr,int k){
        int left = 0, right = k, sum = 0;
        int n = arr.length;
        double maxAverage = Double.NEGATIVE_INFINITY;
        for(int i = 0;i < k;i++){
            sum += arr[i];
        }

        maxAverage = Math.max(maxAverage,(double) sum/k);

        while(right < n) {
            sum -= arr[left];
            sum += arr[right];

            maxAverage = Math.max(maxAverage,(double) sum/k);

            left++;
            right++;
        }
        return maxAverage;
    }
}
