package com.healthcare.arrays.basics;

public class CountPosAndNeg {
    public static int[] getPosAndNeg(int[] arr) {
        int[] posAndNeg = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) posAndNeg[0]++;
            else if (arr[i] < 0) posAndNeg[1]++;
            else continue;
        }
        return posAndNeg;
    }
}
