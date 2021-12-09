package syx.the2021.december;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className SimpleString
 * @description 统计字符串中单次个数(有效单词个数，不包含空格)
 * @url https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 * @tips String
 * @date 2021/12/08 9:53
 */
public class SimpleString {


    public static void main(String[] args) {
        countSegments(", , , ,        a, eaefa");
    }

    public static int countSegments(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int length = s.length();
        char[] chars = s.toCharArray();
        char blank = ' ';
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (i == length - 1 && chars[i] != blank) {
                sum++;
                continue;
            }
            if (i != 0 && chars[i] == blank && chars[i - 1] != blank) {
                sum++;
            }
        }
        return sum;
    }

}
