package com.healthcare.arrays.twopointers;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int getThreeSumClosest(int[] arr,int target){
        Arrays.sort(arr);
        int n = arr.length;
        int closestSum = Integer.MAX_VALUE;
        for (int i=0;i<n-2;i++) {
            int left = i+1, right = n-1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target) {
                    return sum;
                }
                if(Math.abs(sum-target) < Math.abs(closestSum-target)) {
                    closestSum = sum;
                }
                if(sum < target) left++;
                else right--;
            }
        }
        return closestSum;
    }
}
