package syx.plan.arithmetic;

import java.util.Arrays;

/**
 * @author syx
 * @className The2Day
 * @description 算法->十四天计划->第二天
 * @url https://leetcode-cn.com/problems/squares-of-a-sorted-array/、https://leetcode-cn.com/problems/rotate-array/
 * @tips 997.有效数组的平方、189.轮转数组
 * @date 2021/12/24 9:33
 */
public class The2Day {

    public int[] sortedSquares(int[] nums) {
        // 有序数组的平方
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = nums[i] * nums[i];
            }
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 10);

    }

    public static void rotate(int[] nums, int k) {
        // 轮转数组
        int length = nums.length;
        k = k > length ? k % length : k;
        int[] update = new int[length];
        for (int i = 0; i < length; ++i) {
            update[(i + k) % length] = nums[i];
        }
        System.arraycopy(update, 0, nums, 0, length);
    }

}
