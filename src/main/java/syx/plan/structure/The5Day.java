package syx.plan.structure;

/**
 * @author syx
 * @className The5Day
 * @description 数据结构->十四天计划->第五天
 * @url https://leetcode-cn.com/problems/valid-sudoku/、https://leetcode-cn.com/problems/set-matrix-zeroes/
 * @tips 36.有效的数独、73.矩阵置零
 * @date 2021/12/24 9:53
 */
public class The5Day {

    public boolean isValidSudoku(char[][] board) {
        // 数组为 9 * 9
        // 有效的数独
        // 数组为 9 * 9
        // 有效的数独
        int row = board.length;
        int column = board[0].length;

        // 校验规则为：1-9 每一行只能出现一次、每一列只能出现一次、每一个3 * 3 只能出现一次

        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][][] subboxes = new int[3][3][9];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int index = c - '1';
                    // 证明某个数字存在一次，对次数进行加一
                    rows[i][index]++;
                    columns[j][index]++;
                    subboxes[i / 3][j / 3][index]++;
                    if (rows[i][index] != 1 || columns[j][index] != 1 || subboxes[i / 3][j / 3][index] != 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void setZeroes(int[][] matrix) {
        // 矩阵置零
        // 使用原地算法，也就是说，不能借助其他数据结构
        int row = matrix.length;
        int column = matrix[0].length;
        boolean[] m = new boolean[row];
        boolean[] n = new boolean[column];
        // 记录存在0的元素的位置
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    m[i] = n[j] = true;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (m[i] || n[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
