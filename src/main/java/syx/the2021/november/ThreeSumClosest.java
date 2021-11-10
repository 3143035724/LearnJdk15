package syx.the2021.november;

/**
 * @author syx
 * @className ThreeSumClosest
 * @description Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.You may assume that each input would have exactly one solution
 * @url https://leetcode-cn.com/problems/3sum-closest/
 * @tips Array、Two Pointers、Sorting
 * @date 2021/11/10 9:42
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        // 选出三个整数，而非相邻的三个整数
        int nearSum = nums[0] + nums[1] + nums[2];
        int minAbs = Math.abs(nearSum - target);
        if (nums.length == 3) {
            return nearSum;
        }
        // 从第二个位置开始
        for (int first = 0; first < nums.length - 2; first++) {
            for (int second = first + 1; second < nums.length - 1; second++) {
                for (int third = second + 1; third < nums.length; third++) {
                    int sum = nums[first] + nums[second] + nums[third];
                    if (sum == target) {
                        return target;
                    }
                    int abs = Math.abs(sum - target);
                    nearSum = minAbs > abs ? sum : nearSum;
                    minAbs = Math.min(abs, minAbs);
                }
            }
        }
        return nearSum;
    }

    public static void main(String[] args) {
        threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1);
    }
}
