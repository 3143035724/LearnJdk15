package syx.the2022.the1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author syx
 * @className CheckSentence
 * @description 1832.判断橘子是否为全字母句
 * @url https://leetcode-cn.com/problems/check-if-the-sentence-is-pangram/
 * @tips 哈希表、字符串
 * @date 2022/01/23 17:11
 */
public class CheckSentence {

    public boolean checkIfPangram(String sentence) {
        char[] array = sentence.toCharArray();
        char[] chars = new char[26];
        char a = 'a';
        for (char c : array) {
            chars[c - a] = c;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != (a + i)) {
                return false;
            }
        }
        return true;
    }

}
