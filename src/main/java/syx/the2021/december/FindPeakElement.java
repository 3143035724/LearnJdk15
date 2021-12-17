package syx.the2021.december;

/**
 * @author syx
 * @className FindPeakElement
 * @description 寻找数组中峰值对应索引
 * @url https://leetcode-cn.com/problems/find-peak-element/
 * @tips Array、Binary Search
 * @date 2021/12/17 16:33
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 0;
        }
        for (int i = 1; i < length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                return i;
            }
        }
        return nums[0] > nums[length - 1] ? 0 : length - 1;
    }
}
