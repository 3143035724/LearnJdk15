package syx.the2022.the1;

import java.util.Arrays;

/**
 * @author syx
 * @className RunningSum
 * @description 1480.一位数组的动态和
 * @url https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * @tips 数组、前缀和
 * @date 2022/01/22 11:13
 */
public class RunningSum {

    public static void main(String[] args) {
        int[] ints = runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sums[i] = nums[i];
            } else {
                sums[i] = nums[i] + sums[i - 1];
            }
        }
        return sums;
    }

}
