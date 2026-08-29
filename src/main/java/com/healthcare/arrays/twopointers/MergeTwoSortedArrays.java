package com.healthcare.arrays.twopointers;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoArrays(int[] left,int[] right,int m,int n) {
        int[] result = new int[m+n];
        int i = 0, j = 0, index = 0;
        while(i < m && j < n){
            if(left[i] < right[j]) {
                result[index] = left[i];
                i++;
            } else {
                result[index] = right[j];
                j++;
            }
            index++;
        }
        while (i<m){
            result[index] = left[i];
            i++;
            index++;
        }
        while (j<n){
            result[index] = right[j];
            j++;
            index++;
        }
        return result;
    }

    public static int[] mergeTwoArraysInPlace(int[] left,int[] right,int m,int n){
        int index = m+n-1;
        int i = m-1, j = n-1;
        while(i >= 0 && j >= 0) {
            if(left[i] < right[j]) {left[index] = right[j];j--;}
            else { left[index] = left[i];i--; }
            index--;
        }
        while(j >= 0){
            left[index] = right[j];
            j--;
            index--;
        }
        return left;
    }
}
