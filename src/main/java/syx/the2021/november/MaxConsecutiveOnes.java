package syx.the2021.november;

/**
 * @author syx
 * @className MaxConsecutiveOnes
 * @description Given a binary array nums, return the maximum number of consecutive 1's in the array
 * @url https://leetcode-cn.com/problems/max-consecutive-ones/
 * @tips Array
 * @date 2021/11/12 15:17
 */
public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
                if (i == nums.length - 1) {
                    max = Math.max(max, temp);
                }
            } else {
                max = Math.max(max, temp);
                temp = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
    }

}
