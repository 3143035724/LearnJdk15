package syx.july2021;

/**
 * @author syx
 * @className The1thDay
 * @description TODO
 * @date 2021/07/26 17:06
 */
public class The1thDay {
    /**
     * 题目：34. 在排序数组中查找元素的第一个和最后一个位置
     * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
     */

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        result[0] = getIndex(nums, target, true);
        result[1] = getIndex(nums, target, false);
        return result;
    }

    private int getIndex(int[] nums, int target, boolean isLeft) {
        int result = -1;
        int left = 0;
        int right = nums.length - 1, middle;
        while (left <= right) {
            middle = left + (right - left) / 2;
            // 对比中间值和target的区别
            if (target < nums[middle]) {
                // 目标值<中间值，目标值在中间值的左边
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                // 相等情况
                result = middle;
                if (isLeft) {
                    // 寻找左边界(右边向左移)
                    right = middle - 1;
                } else {
                    // 寻找右边界(左边开始位置加)
                    left = middle + 1;
                }
            }
        }
        return result;
    }
}
