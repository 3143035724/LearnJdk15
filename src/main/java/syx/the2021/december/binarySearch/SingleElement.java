package syx.the2021.december.binarySearch;

/**
 * @author syx
 * @className SingleElement
 * @description 540.有序数组中的单一元素
 * @url https://leetcode-cn.com/problems/single-element-in-a-sorted-array/
 * @tips Array、Binary Search
 * @date 2021/12/31 16:26
 */
public class SingleElement {

    public static void main(String[] args) {
//        singleNonDuplicate1(new int[]{1, 1, 3});
        singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11});
    }


    public static int singleNonDuplicate(int[] nums) {
        // 优化版本
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        // 使用二分查找
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == nums[middle - 1]) {
                if ((middle - left) % 2 == 0) {
                    // 在左侧
                    right = middle - 2;
                } else {
                    left = middle + 1;
                }
            } else if (nums[middle] == nums[middle + 1]) {
                if ((right - middle) % 2 == 0) {
                    left = middle + 2;
                } else {
                    right = middle - 1;
                }
            } else {
                return nums[middle];
            }
        }
        return nums[left];
    }

    public static int singleNonDuplicate1(int[] nums) {
        // 初始版本
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 2; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

}
