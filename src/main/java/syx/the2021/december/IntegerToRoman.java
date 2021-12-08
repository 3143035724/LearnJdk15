package syx.the2021.december;

/**
 * @author syx
 * @className IntegerToRoman
 * @description 整数转罗马数字
 * @url https://leetcode-cn.com/problems/integer-to-roman/
 * @tips HashTable、Math、String
 * @date 2021/12/07 17:59
 */
public class IntegerToRoman {

    static int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public static String intToRoman(int num) {
        // 判断num所在区间
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num -= value;
                result.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        intToRoman(1994);
    }
}
