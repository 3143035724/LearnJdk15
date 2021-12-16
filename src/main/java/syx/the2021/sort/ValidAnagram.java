package syx.the2021.sort;

import java.util.Arrays;

/**
 * @author syx
 * @className ValidAnagram
 * @description Given two strings s and t, return true if t is an anagram of s, and false otherwise
 * @url https://leetcode-cn.com/problems/valid-anagram/
 * @tips HashTable、String、Sorting
 * @date 2021/12/16 15:49
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (t == null || t.length() == 0 || s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;
    }
}
