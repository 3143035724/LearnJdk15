package syx.the2021.december;

/**
 * @author syx
 * @className AddStrings
 * @description 415.字符串相加
 * @url https://leetcode-cn.com/problems/add-strings/
 * @tips 数学、字符串、模拟
 * @date 2021/12/30 17:56
 */
public class AddStrings {

    public static void main(String[] args) {
        String s = addStrings("456", "77");
        System.out.println(s);
    }

    public static String addStrings(String num1, String num2) {
        if (num2.length() > num1.length()) {
            return addStrings(num2, num1);
        }
        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();
        int num1Length = num1Chars.length;
        int num2Length = num2Chars.length;
        int ten = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < num1Length; i++) {
            int num = 0;
            if (i < num2Length) {
                num = num2Chars[num2Length - 1 - i] - '0';
            }
            num = num + num1Chars[num1Length - 1 - i] - '0';
            num += ten;
            if (num >= 10) {
                ten = num / 10;
                num = num % 10;
            } else {
                ten = 0;
            }
            s.insert(0, num);
            if (i == num1Length - 1 && ten != 0) {
                s.insert(0, ten);
            }
        }
        return s.toString();
    }
}
