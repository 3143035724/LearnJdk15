package syx.the2021.november;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className ValidPalindrome
 * @description A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise
 * @url https://leetcode-cn.com/problems/valid-palindrome/
 * @tips TwoPointers、String
 * @date 2021/11/10 16:54
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        List<Character> charsList = new ArrayList<>();
        for (char aChar : chars) {
            if (valid(aChar)) {
                if (aChar >= 97 && aChar <= 122) {
                    charsList.add((char) (aChar - 32));
                } else {
                    charsList.add(aChar);
                }
            }
        }
        if (charsList.size() != 0) {
            int end = charsList.size() - 1;
            for (int i = 0; i < end; i++) {
                if (!charsList.get(i).equals(charsList.get(end))) {
                    return false;
                }
                end--;
            }
        }
        return true;
    }

    private boolean valid(int c) {
        if (c >= 48 && c <= 57) {
            return true;
        }

        if (c >= 65 && c <= 90) {
            return true;
        }

        return c >= 97 && c <= 122;
    }
}
