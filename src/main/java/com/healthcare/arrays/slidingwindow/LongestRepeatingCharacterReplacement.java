package com.healthcare.arrays.slidingwindow;

/**
 * Problem Statement:
 *
 * Given a string s consisting of uppercase English letters and an integer k,
 * find the length of the longest substring that can be made of one repeating
 * character by replacing at most k characters.
 *
 * Example:
 * s = "AABABBA"
 * k = 1
 *
 * The substring "AABA" can become "AAAA" by replacing one 'B', so its
 * length is 4.
 *
 * Output:
 * 4
 *
 * Approach:
 * Use a variable-size sliding window with a frequency array. Track the most
 * frequent character in the window; if window size minus that frequency is
 * greater than k, shrink the window from the left.
 */
public class LongestRepeatingCharacterReplacement {
    public static int getLongestRepeatingCharacterReplacement(String s, int k){
        int left = 0, max = Integer.MIN_VALUE, maxFrequency = 0;
        int[] freq = new int[26];

        for(int right = 0; right < s.length();right++){
            freq[s.charAt(right)]++;

            maxFrequency = Math.max(maxFrequency,freq[s.charAt(right) - 'A']);

            while((right-left+1) - maxFrequency > k ){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            // Update longest valid window
            max = Math.max(
                    max,
                    right - left + 1
            );
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
