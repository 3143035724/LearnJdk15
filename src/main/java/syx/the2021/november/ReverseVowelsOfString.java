package syx.the2021.november;

/**
 * @author syx
 * @className ReverseVowelsOfString
 * @description Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases
 * @url https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 * @tips TwoPointers、String
 * @date 2021/11/12 16:54
 */
public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        // 反转数组
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (!valid(chars[start])) {
                start++;
                continue;
            }
            if (!valid(chars[end])) {
                end--;
                continue;
            }
            // 交换start和end的位置
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    private static boolean valid(char c) {
        // a 97 e 101 i 105 o 111 u 117
        // A 65 E 69 I 73 O 79 U 85
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        reverseVowels("hello");
    }
}
