package com.healthcare.arrays.twopointers;

public class LongestMountain {
    public static int getLongestMountain(int[] arr){
        int maxLength = 0;
        int n = arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                int left = i;
                while(left >0 && arr[left-1] < arr[left]){
                    left--;
                }

                int right = i;
                while(right < n-1 && arr[right] > arr[right+1]){
                    right++;
                }
                int currentLength = right - left + 1;
                maxLength = Math.max(maxLength,currentLength);
            }
        }
        return maxLength;
    }
}
