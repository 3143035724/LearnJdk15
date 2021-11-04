package syx.the2021.november;

/**
 * @author syx
 * @className MaximumSubarray
 * @description Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.A subarray is a contiguous part of an array
 * @url https://leetcode-cn.com/problems/maximum-subarray/
 * @tips Array、Divide and Conquer、Dynamic Programming
 * @date 2021/11/04 14:17
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        // 双指针
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum = Math.max(sum + num, num);
            max = Math.max(sum, max);
        }
        return max;
    }
}
