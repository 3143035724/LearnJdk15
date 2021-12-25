package syx.plan.structure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据结构->十四天计划->第六天
 *
 * @author kixs
 * @version v1.0.0
 * @since 2021/12/25 14:35
 */
public class The6Day {

    public int firstUniqChar(String s) {
        // 387.字符串中第一个唯一字符
        // https://leetcode-cn.com/problems/first-unique-character-in-a-string/
        if (s == null || s.length() == 0) {
            return -1;
        }
        char[] chars = s.toCharArray();
        int[] freq = new int[26];
        char valid = 'a';
        for (char aChar : chars) {
            freq[aChar - valid]++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        // 383.赎金信
        // https://leetcode-cn.com/problems/ransom-note/
        // 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成
        char[] chars = ransomNote.toCharArray();
        if (magazine == null || magazine.length() < chars.length) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] array = magazine.toCharArray();
        for (char aChar : array) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        for (char aChar : chars) {
            if (!map.containsKey(aChar) || map.get(aChar) <= 0) {
                return false;
            }
            map.replace(aChar, map.get(aChar) - 1);
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {
        // 242.有效的字母异位词
        // https://leetcode-cn.com/problems/valid-anagram/
        char[] chars = s.toCharArray();
        if (t == null || t.length() != chars.length) {
            return false;
        }
        char[] array = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(array);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != array[i]) {
                return false;
            }
        }
        return true;
    }

}
