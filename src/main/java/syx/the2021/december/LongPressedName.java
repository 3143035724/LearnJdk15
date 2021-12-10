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
        if (typed.length() <= name.length() && !typed.equals(name)) {
            return false;
        }
        // 处理对应字符
        int first = 0;
        int second = 0;
        char[] typedArray = typed.toCharArray();
        char[] nameArray = name.toCharArray();
        while (second < typedArray.length) {
            if (first < nameArray.length && nameArray[first] == typedArray[second]) {
                first++;
                second++;
            } else if (second > 0 && typedArray[second] == typedArray[second - 1]) {
                second++;
            } else {
                return false;
            }
        }
        return first == nameArray.length;
    }
}
