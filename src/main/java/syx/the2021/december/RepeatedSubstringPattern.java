package syx.the2021.december;

/**
 * @author syx
 * @className RepeatedSubstringPattern
 * @description Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring togethe
 * @url https://leetcode-cn.com/problems/repeated-substring-pattern/
 * @tips String、String Matching
 * @date 2021/12/09 10:20
 */
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        // 该情况不存在s为空的情况
        // 判断当前length是否是质数，如果是质数直接返回false
        int length = s.length();
        String child = "" + s.charAt(0);
        for (int i = 0; i < length; i++) {

        }
        return true;
    }

    public static void main(String[] args) {
        repeatedSubstringPattern("abcbccabc");
    }
}
