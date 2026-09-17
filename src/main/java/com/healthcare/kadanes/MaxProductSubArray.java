package com.healthcare.kadanes;

public class MaxProductSubArray {
    public static int getMaxProductSubArray(int[] arr){
        int bestMax = arr[0], bestMin = arr[0], res = arr[0];
        for(int i=1;i<arr.length;i++){
            bestMax = Math.max(arr[i], Math.max(bestMax * arr[i], bestMin * arr[i]));
            bestMin = Math.min(arr[i], Math.min(bestMin * arr[i],bestMax));
            res = Math.max(res,Math.max(bestMax,bestMin));
        }
        return res;
    }
}
