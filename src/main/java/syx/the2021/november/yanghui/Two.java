package syx.the2021.november.yanghui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author syx
 * @className Two
 * @description leetcode yanghui Two
 * @url https://leetcode-cn.com/problems/pascals-triangle-ii/
 * @tips 数组、动态规划
 * @date 2021/11/03 16:49
 */
public class Two {

    public static List<Integer> getRow(int rowIndex) {
        // 前两行的时候，杨辉三角数据固定
        List<List<Integer>> list = new ArrayList<>();
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }
        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }

        list.add(Collections.singletonList(1));
        list.add(Arrays.asList(1, 1));
        // 从第三行开始，每一行的第一个数为1，
        for (int i = 2; i <= rowIndex; i++) {
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
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        getRow(3);
    }
}
