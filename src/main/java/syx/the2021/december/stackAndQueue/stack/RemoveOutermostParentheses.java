package syx.the2021.december.stackAndQueue.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author syx
 * @className RemoveOutermostParentheses
 * @description 1021.删除最外层的括号
 * @url https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * @tips 栈、字符串
 * @date 2021/12/28 15:38
 */
public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        removeOuterParentheses("(()())(())");
    }

    public static String removeOuterParentheses(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        char[] chars = s.toCharArray();
        List<String> list = new ArrayList<>();
        int startIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!stack.isEmpty() && stack.peek().equals(map.get(chars[i]))) {
                stack.pop();
                if (stack.isEmpty()) {
                    // 前i个元素的拼接和
                    StringBuilder string = new StringBuilder();
                    for (int j = startIndex; j <= i; j++) {
                        string.append(chars[j]);
                    }
                    list.add(string.toString());
                    startIndex = i + 1;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        StringBuilder sBuilder = new StringBuilder();
        for (String s1 : list) {
            sBuilder.append(s1, 1, s1.length() - 1);
        }
        s = sBuilder.toString();
        return s;
    }

}
