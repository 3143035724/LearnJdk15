package syx.the2021.december;

/**
 * @author syx
 * @className BuildArrayFromPermutation
 * @description 1920.基于排列构建数组
 * @url https://leetcode-cn.com/problems/build-array-from-permutation/
 * @tips 数组、模拟
 * @date 2021/12/20 14:16
 */
public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
