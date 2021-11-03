package syx.the2021.november.yanghui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author syx
 * @className One
 * @description leetcode yanghui one
 * @url https://leetcode-cn.com/problems/pascals-triangle/
 * @tips 数组、动态规划
 * @date 2021/11/03 16:50
 */
public class One {

    public static List<List<Integer>> generate(int numRows) {
        // 返回杨辉三角的前n行
        if (numRows == 0) {
            return new ArrayList<>();
        }
        // 前两行的时候，杨辉三角数据固定
        List<List<Integer>> list = new ArrayList<>(numRows);
        if (numRows == 1 || numRows == 2) {
            list.add(Collections.singletonList(1));
            if (numRows == 2) {
                list.add(Arrays.asList(1, 1));
            }
            return list;
        } else {
            list.add(Collections.singletonList(1));
            list.add(Arrays.asList(1, 1));
        }
        // 从第三行开始，每一行的第一个数为1，
        for (int i = 2; i <= numRows - 1; i++) {
            List<Integer> middle = new ArrayList<>(i + 1);
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    middle.add(j, 1);
                } else {
                    List<Integer> lowList = list.get(i - 1);
                    middle.add(j, lowList.get(j - 1) + lowList.get(j));
                }
            }
            list.add(middle);
        }

        return list;
    }

    public static void main(String[] args) {
        generate(30);
    }
}
