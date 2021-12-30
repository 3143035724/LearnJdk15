package syx.the2021.december;

/**
 * @author syx
 * @className DetectCapital
 * @description 520.检测大写字母
 * @url https://leetcode-cn.com/problems/detect-capital/
 * @tips
 * @date 2021/12/30 17:47
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        // 大写字母的个数
        int count = 0;
        boolean first = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (i == 0) {
                    first = true;
                }
                count++;
            }
        }
        if (count == 0 || (first && count == 1)) {
            return true;
        }
        return count == chars.length;
    }

}
