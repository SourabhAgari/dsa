package com.healthcare.arrays.slidingwindow;

public class MinWindowSubString {
    public static String minWindow(String s,String t){
        if (s.isEmpty() || t.isEmpty() || t.length() > s.length()) {
            return "";
        }

        int[] have = new int[256];
        int[] needed = new int[256];
        int left = 0, start = 0, minLength = Integer.MAX_VALUE;

        for(int i=0;i<t.length();i++){
            needed[t.charAt(i)]++;
        }

        for(int right=0;right<s.length();right++){
            have[s.charAt(right)]++;

            while(isValid(needed,have)){
                int windowLength = right - left + 1;
                if(windowLength < minLength){
                    minLength = windowLength;
                    start = left;
                }
                have[s.charAt(left)]--;
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start,start+minLength);
    }

    public static Boolean isValid(int[] needed, int[] have){
        for(int i=0;i<256;i++){
            if(have[i] < needed[i]) {
                return false;
            }
        }
        return true;
    }
}
