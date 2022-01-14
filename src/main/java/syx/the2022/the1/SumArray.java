package syx.the2022.the1;

import java.util.Arrays;

/**
 * @author syx
 * @className SumArray
 * @description 1877.数组中最大数对和的最小值
 * @url https://leetcode-cn.com/problems/minimize-maximum-pair-sum-in-array/
 * @tips 贪心算法、数组、双指针、排序
 * @date 2022/01/14 17:34
 */
public class SumArray {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int max = 0;
        int tmp = 0;
        while (left < right) {
            tmp = Math.max(nums[left] + nums[right], tmp);
            max = Math.max(max, tmp);
            left++;
            right--;
        }
        return max;
    }

}
