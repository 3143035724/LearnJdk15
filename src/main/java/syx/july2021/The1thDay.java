package syx.july2021;

import org.junit.Test;

/**
 * @author syx
 * @className The1thDay
 * @description 标签：二分查找
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

    /**
     * 题目：33. 搜索旋转排序数组
     * https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
     */
    public int search1(int[] nums, int target) {
        int result = -1;
        if (nums == null || nums.length == 0) {
            return result;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int length = nums.length;
        if (nums[0] > target && nums[length - 1] < target) {
            return result;
        }

        int left = 0;
        int right = nums.length - 1, middle;
        int first = nums[0];
        int last = nums[right];
        while (left <= right) {
            middle = (left + right) / 2;
            // 比较中间位置的值
            if (nums[middle] == target) {
                return middle;
            }
            // 判断左右哪方属于顺序
            if (first <= nums[middle]) {
                // 左边顺序
                if (first <= target && nums[middle] > target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                // 右边顺序
                if (last >= target && nums[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return result;
    }

    public int search2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


    @Test
    public void test() {
        search1(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    }
}
