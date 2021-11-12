package syx.the2021.november;

import java.util.HashMap;
import java.util.Map;

/**
 * @author syx
 * @className UniqueCharacter
 * @description en a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1
 * @url https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * @tips Queue、HashTable、String、Counting
 * @date 2021/11/12 17:49
 */
public class UniqueCharacter {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        char[] chars = s.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>(16);
        for (char aChar : chars) {
            countMap.put(aChar, countMap.getOrDefault(aChar, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (countMap.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
