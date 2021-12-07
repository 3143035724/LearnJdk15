package syx.the2021.december;

/**
 * @author syx
 * @className TruncateSentence
 * @description You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it
 * @url https://leetcode-cn.com/problems/truncate-sentence/
 * @tips Array、String
 * @date 2021/12/06 11:57
 */
public class TruncateSentence {

    public static String truncateSentence(String s, int k) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String sentence = truncateSentence("chopper is not a tanuki", 5);
        System.out.println(sentence);
    }

}
