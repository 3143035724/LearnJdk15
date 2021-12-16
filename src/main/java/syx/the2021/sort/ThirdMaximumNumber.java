package syx.the2021.sort;

import java.util.Arrays;

/**
 * @author syx
 * @className ThirdMaximumNumber
 * @description Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number
 * @url https://leetcode-cn.com/problems/third-maximum-number/
 * @tips Array、Sorting
 * @date 2021/12/16 16:50
 */
public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int result = 0;
        int third = 0;
        for (int length = nums.length - 1; length >= 0; length--) {
            if (length == nums.length - 1) {
                result = nums[length];
                third++;
            } else {
                if (result != nums[length]) {
                    result = nums[length];
                    third++;
                }
            }
            if (third == 3) {
                return result;
            }
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        thirdMax(new int[]{2, 2, 3, 1});
    }
}
