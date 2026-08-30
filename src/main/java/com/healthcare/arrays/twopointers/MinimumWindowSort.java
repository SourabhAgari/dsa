package com.healthcare.arrays.twopointers;

public class MinimumWindowSort {
    public static int minimumWindowSort(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left < n-1 && arr[left] <= arr[left+1]){
            left++;
        }

        while(right > 0 && arr[right] >= arr[right-1]) {
            right--;
        }

        if(left == n-1 && right==0) return 0;

        int min = arr[left];
        int max = arr[left];

        for(int i=left;i<=right;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        while(left > 0 && arr[left-1] > min){
            left--;
        }

        while (right < n-1 && arr[right+1] < max) {
            right++;
        }
        return (right - left) + 1;
    }
}
