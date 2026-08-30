package com.healthcare.arrays.twopointers;

import com.healthcare.arrays.utils.Utils;

public class SortColors {
    public static int[] sortColors(int[] nums){
        int n = nums.length;
        int low = 0, mid =0 , high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                Utils.swap(nums,low,mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) mid++;
            else {
                Utils.swap(nums,mid,high);
                high--;
            }
        }
        return nums;
    }
}
