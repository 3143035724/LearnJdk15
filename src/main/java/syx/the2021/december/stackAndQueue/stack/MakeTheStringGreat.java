package syx.the2021.december.stackAndQueue.stack;

/**
 * @author syx
 * @className MakeTheStringGreat
 * @description 1544.整理字符串
 * @url https://leetcode-cn.com/problems/make-the-string-great/
 * @tips 栈、字符串
 * @date 2021/12/28 17:03
 */
public class MakeTheStringGreat {

    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            if (builder.toString().length() == 0) {
                builder.append(aChar);
                continue;
            }
            char charAt = builder.charAt(builder.length() - 1);
            if (charAt + 32 == aChar || charAt - 32 == aChar) {
                builder.deleteCharAt(builder.length() - 1);
            } else {
                builder.append(aChar);
            }
        }
        return builder.toString();
    }

}
