package syx.plan.structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author syx
 * @className The9Day
 * @description 数据结构->十四天计划->第九天
 * @url https://leetcode-cn.com/problems/valid-parentheses/、https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * @tips 20.有效的括号、232.用栈实现队列
 * @date 2021/12/28 9:22
 */
public class The9Day {

    public static boolean isValid(String s) {
        // 栈、字符串
        // 字符串中括号必须根据顺序有效闭合
        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (stack.isEmpty()) {
                stack.push(aChar);
            } else {
                if (stack.peek().equals(map.get(aChar))) {
                    stack.pop();
                } else {
                    stack.push(aChar);
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid("{[]}");
    }

}

/**
 * 用栈实现队列
 */
class MyQueue {

    private Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        // 将元素 x 推到队列的末尾
        pushStack(x);
    }

    private void pushStack(int x) {
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            tmp.push(stack.pop());
        }
        tmp.push(x);
        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }
    }

    public int pop() {
        // 从队列的开头移除并返回元素
        return stack.pop();
    }

    public int peek() {
        // 返回队列开头的元素
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
