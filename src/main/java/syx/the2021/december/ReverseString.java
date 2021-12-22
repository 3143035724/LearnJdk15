package syx.the2021.december;

/**
 * @author syx
 * @className ReverseString
 * @description 541.反转字符串
 * @url https://leetcode-cn.com/problems/reverse-string-ii/
 * @tips 双指针、字符串
 * @date 2021/12/20 17:30
 */
public class ReverseString {

    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i += 2 * k) {
            reverse(chars, i, Math.min(i + k, length) - 1);
        }
        return new String(chars);
    }

    private void reverse(char[] arr, int left, int right) {
        // 反转
        while (left < right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}
