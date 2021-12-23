package syx.plan.arithmetic;

/**
 * @author syx
 * @className The1Day
 * @description 算法->十四天计划->第一天
 * @url https://leetcode-cn.com/problems/first-bad-version/、https://leetcode-cn.com/problems/binary-search/、https://leetcode-cn.com/problems/search-insert-position/
 * @tips 278.第一个错误的版本、704.二分查找、35.搜索插入位置
 * @date 2021/12/23 11:54
 */
public class The1Day {

    class Solution {

        public int searchInsert(int[] nums, int target) {
            // 35.搜索插入位置 优化版本
            if (nums == null || nums.length == 0) {
                return 0;
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target || nums[i] > target) {
                    return i;
                }
            }
            return nums.length;
        }
    }

    public static int searchInsert(int[] nums, int target) {
        // 35.搜索插入位置
        int left = 0;
        int right = nums.length - 1;

        if (nums[left] >= target) {
            return 0;
        }
        if (nums[right] <= target) {
            return nums[right] == target ? right : right + 1;
        }

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return target;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return left;
    }

    public int search(int[] nums, int target) {
        // 704.二分查找
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        firstBadVersion(5);
//        search(new int[]{5}, 5);
        searchInsert(new int[]{1, 3, 5, 6}, 5);
    }


    private boolean isBadVersion(int version) {
        return version > 3;
    }

    public int firstBadVersion(int n) {
        // 278.第一个错误的版本
        int left = 1;
        int right = n;
        while (left < right) {
            // 防止溢出
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }


}
