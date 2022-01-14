package syx.the2022.the1;

import java.util.Arrays;

/**
 * @author syx
 * @className MaxArea
 * @description 1637.两点之间不包含任何点的最宽垂直面积
 * @url https://leetcode-cn.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 * @tips 数组、排序
 * @date 2022/01/14 17:47
 */
public class MaxArea {

    public int maxWidthOfVerticalArea(int[][] points) {
        int[] widths = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            widths[i] = points[i][0];
        }
        Arrays.sort(widths);
        int max = 0;
        for (int i = 0; i < widths.length - 1; i++) {
            max = Math.max(widths[i + 1] - widths[i], max);
        }
        return max;
    }

}
