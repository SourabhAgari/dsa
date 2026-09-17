package com.healthcare.kadanes;

public class MaxSumWithOneDeletion {
    public static int getMaxSumWithOneDeletion(int[] arr){
        int bestNoDelete = arr[0], bestOneDelete = 0, result = arr[0];
        for(int i=1;i<arr.length;i++){
            int oldNoDelete = bestNoDelete;
            int oldOneDelete = bestOneDelete;

            bestNoDelete = Math.max(arr[i],oldNoDelete + arr[i]);
            bestOneDelete = Math.max(oldOneDelete + arr[i],oldNoDelete);

            result = Math.max(result,Math.max(bestNoDelete,bestOneDelete));
        }
        return result;
    }
}
