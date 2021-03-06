package syx.the2021.sort;

/**
 * @author syx
 * @className FindTheDifference
 * @description You are given two strings s and t.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Return the letter that was added to t
 * @url https://leetcode-cn.com/problems/find-the-difference/
 * @tips BitManipulation、HashTable、String、Sorting
 * @date 2021/12/16 16:24
 */
public class FindTheDifference {

    /**
     * 内存37MB，时间1ms
     */
    public char findTheDifference(String s, String t) {
        if (t.length() == 1) {
            return t.charAt(0);
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int sSum = 0;
        int tSum = 0;
        for (char c : sArray) {
            sSum += c;
        }
        for (char c : tArray) {
            tSum += c;
        }
        return (char) (tSum - sSum);
    }

    /**
     * 内存37.1MB，时间1ms
     */
    public char findTheDifference1(String s, String t) {
        if (t.length() == 1) {
            return t.charAt(0);
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int sum = 0;
        for (int i = 0; i < tArray.length; i++) {
            if (i == sArray.length) {
                sum += tArray[i];
            } else {
                sum += (tArray[i] - sArray[i]);
            }
        }
        return (char) sum;
    }

}
