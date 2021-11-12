package syx.the2021.november;

/**
 * @author syx
 * @className ReverseString
 * @description Write a function that reverses a string. The input string is given as an array of characters s
 * You must do this by modifying the input array in-place with O(1) extra memory
 * @url https://leetcode-cn.com/problems/reverse-string/
 * @tips Recursion、TwoPointers、String
 * @date 2021/11/12 16:37
 */
public class ReverseString {

    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        // 反转数组
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = s[length - 1 - i];
            s[length - 1 - i] = s[i];
            s[i] = temp;
        }
    }

}
