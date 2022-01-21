package syx.the2022.the1;

/**
 * @author syx
 * @className MaximumNumberWords
 * @description 2114.句子中最多单词数
 * @url https://leetcode-cn.com/problems/maximum-number-of-words-found-in-sentences/
 * @tips 数组、字符串
 * @date 2022/01/21 10:13
 */
public class MaximumNumberWords {

    public int mostWordsFound(String[] sentences) {
        int length = sentences.length;
        if (length == 0) {
            return 0;
        }
        int max = 0;
        for (String sentence : sentences) {
            max = Math.max(max, sentence.split(" ").length);
        }
        return max;
    }

}
