package syx.the2021.december.stackAndQueue.stack;

import java.util.Stack;

/**
 * @author syx
 * @className BackspaceStringCompare
 * @description 844.比较含退格的字符串
 * @url https://leetcode-cn.com/problems/backspace-string-compare/
 * @tips 栈、双指针、字符串、模拟
 * @date 2021/12/28 14:12
 */
public class BackspaceStringCompare {

    public static void main(String[] args) {
        // "y#fo##f"
        //"y#f#o##f"
        backspaceCompare("y#fo##f", "y#f#o##f");
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = init(s.toCharArray());
        Stack<Character> tStack = init(t.toCharArray());
        if (sStack.size() != tStack.size()) {
            return false;
        }
        while (!sStack.isEmpty()) {
            if (!sStack.pop().equals(tStack.pop())) {
                return false;
            }
        }
        return true;
    }

    private static Stack<Character> init(char[] chars) {
        char valid = '#';
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == valid) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(aChar);
            }
        }
        return stack;
    }

}
