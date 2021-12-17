package syx.the2021.sort;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author syx
 * @className RelativeRanks
 * @description Sorting
 * @url https://leetcode-cn.com/problems/relative-ranks/
 * @tips Array、Sorting、Heap(Priority Queue)
 * @date 2021/12/17 9:50
 */
public class RelativeRanks {

    public static String[] findRelativeRanks(int[] score) {
        // TODO 存在可优化空间
        String[] answer = new String[score.length];
        Stack<Integer> stack = new Stack<>();
        int[] middle = new int[score.length];
        System.arraycopy(score, 0, middle, 0, score.length);
        Arrays.sort(middle);
        for (int i : middle) {
            stack.push(i);
        }
        // 不能变更本身数组中的排序
        for (int i = 0; i < score.length; i++) {
            int index = stack.search(score[i]);
            if (index == 1) {
                answer[i] = "Gold Medal";
            } else if (index == 2) {
                answer[i] = "Silver Medal";
            } else if (index == 3) {
                answer[i] = "Bronze Medal";
            } else {
                answer[i] = index + "";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        findRelativeRanks(new int[]{10, 3, 8, 9, 4});
    }

}
