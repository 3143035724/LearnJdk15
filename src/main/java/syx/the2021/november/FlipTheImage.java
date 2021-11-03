package syx.the2021.november;

/**
 * @author syx
 * @className FlipTheImage
 * @description leetcode FlipTheImage
 * @url https://leetcode-cn.com/problems/flipping-an-image/
 * @tips 数组、双指针、矩阵、模拟
 * @date 2021/11/03 14:41
 */
public class FlipTheImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        // 1、反转每一行
        // 2、反转图片：0->1 1->0
        if (image == null || image.length == 0) {
            return new int[][]{};
        }
        int length = image.length;
        int[][] result = new int[length][];
        for (int i = 0; i < length; i++) {
            int[] iInfo = image[i];
            result[i] = new int[iInfo.length];
            for (int j = 0; j < iInfo.length; j++) {
                int x = image[i][iInfo.length - 1 - j];
                result[i][j] = (x == 0 ? 1 : 0);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}});
    }
}
