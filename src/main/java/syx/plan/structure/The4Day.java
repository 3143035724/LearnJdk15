package syx.plan.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author syx
 * @className The4Day
 * @description 数据结构->十四天计划->第四天
 * @url https://leetcode-cn.com/problems/pascals-triangle/、https://leetcode-cn.com/problems/reshape-the-matrix/
 * @tips 118.杨辉三角、566.重塑矩阵
 * @date 2021/12/23 9:24
 */
public class The4Day {

    public List<List<Integer>> generate(int numRows) {
        // 杨辉三角
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 1 || numRows == 2) {
            list.add(Collections.singletonList(1));
            if (numRows == 2) {
                list.add(Arrays.asList(1, 1));
            }
            return list;
        }
        list.add(Collections.singletonList(1));
        list.add(Arrays.asList(1, 1));
        // 从第三行开始进行循环
        for (int i = 2; i < numRows; i++) {
            List<Integer> nums = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    nums.add(j, 1);
                } else {
                    List<Integer> infoList = list.get(i - 1);
                    nums.add(j, infoList.get(j - 1) + infoList.get(j));
                }
            }
            list.add(nums);
        }
        return list;
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // 重塑矩阵
        // r-行 c-列
        int oldRow = mat.length;
        int oldColumn = mat[0].length;
        if (oldColumn * oldRow != r * c) {
            return mat;
        }
        int[][] newMatrix = new int[r][c];
        int newRow = 0;
        int newColumn = 0;
        for (int i = 0; i < oldRow; i++) {
            for (int j = 0; j < oldColumn; j++) {
                newMatrix[newRow][newColumn] = mat[i][j];
                newColumn++;
                // 当现有列和指定列数相等时，换行，通知将现有列初始为0
                if (newColumn == c) {
                    newRow++;
                    newColumn = 0;
                }
            }
        }
        return newMatrix;
    }

}
