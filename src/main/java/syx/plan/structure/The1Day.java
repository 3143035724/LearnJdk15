package syx.plan.structure;

import java.util.Arrays;

/**
 * @author syx
 * @className The1Day
 * @description 十四天计划-第一天
 * @url https://leetcode-cn.com/problems/contains-duplicate/、https://leetcode-cn.com/problems/maximum-subarray/
 * @tips 217.存在重复元素、53.最大子数组和
 * @date 2021/12/20 14:50
 */
public class The1Day {
    public boolean containsDuplicate(int[] nums) {
        // 存在重复元素
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public int maxSubArray(int[] nums) {
        // 最大子数组和
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int num : nums) {
            tmp = Math.max(tmp + num, num);
            max = Math.max(max, tmp);
        }
        return max;
    }

    public static void main(String[] args) {

    }

}
