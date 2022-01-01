package syx.the2021.december.stackAndQueue.stack;

import java.util.Stack;

/**
 * @author syx
 * @className BaseballGame
 * @description 682.棒球比赛
 * @url https://leetcode-cn.com/problems/baseball-game/
 * @tips 栈、数组、模拟
 * @date 2021/12/28 13:51
 */
public class BaseballGame {

    public static int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                //  表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数
                stack.pop();
            } else if (ops[i].equals("D")) {
                // 表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数
                stack.push(stack.peek() * 2);
            } else if (ops[i].equals("+")) {
                //  表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数
                Integer pop = stack.pop();
                int count = stack.peek() + pop;
                stack.push(pop);
                stack.push(count);
            } else {
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        calPoints(new String[]{"5", "2", "C", "D", "+"});
    }

}
