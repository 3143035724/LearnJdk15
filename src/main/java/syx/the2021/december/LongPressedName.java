package syx.the2021.december;

/**
 * 925、长按键入
 *
 * @author kixs
 * @version v1.0.0
 * @since 2021/12/9 23:48
 */
public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        // 判断是否为有效输入字符
        // typed为键盘输入
        char[] systemInArray = typed.toCharArray();
        char[] nameArray = name.toCharArray();
        if (systemInArray.length <= nameArray.length) {
            return name.equals(typed);
        }
        int start = 0;
        int second = 0;
        while (second < systemInArray.length) {
            if (start < nameArray.length && nameArray[start] == systemInArray[second]) {
                // 两者相等
                start++;
                second++;
            } else if (second > 0 && systemInArray[second] == systemInArray[second - 1]) {
                second++;
            } else {
                return false;
            }
        }
        return start == nameArray.length;
    }
}
