package syx.the2021.december;

import java.util.Arrays;

/**
 * @author syx
 * @className RotatedSortedArray
 * @description 在旋转数组中寻找target
 * @url https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/
 * @tips Array、Binary Search
 * @date 2021/12/23 16:51
 */
public class RotatedSortedArray {

    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return true;
            }
            if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }

}
