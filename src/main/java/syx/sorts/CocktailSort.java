package syx.sorts;

import java.util.Arrays;

/**
 * @author syx
 * @className CocktailSort
 * @description 鸡尾酒排序
 * @date 2021/12/17 14:32
 */
public class CocktailSort {

    public static void main(String[] args) {
        // 定向冒泡排序
        int[] nums = new int[]{1, 3, 5, 4, 6, 7, 9, 11, 1, 23, 5, 4};
        int index;
        int left = 0;
        int right = nums.length - 1;
        int num;
        while (left < right) {
            for (index = left; index < right; index++) {
                if (nums[index] > nums[index + 1]) {
                    num = nums[index];
                    nums[index] = nums[index + 1];
                    nums[index + 1] = num;
                }
            }
            right--;
            for (index = right; index > left; index--) {
                if (nums[index - 1] > nums[index]) {
                    num = nums[index];
                    nums[index] = nums[index - 1];
                    nums[index - 1] = num;
                }
            }
            left++;
        }
        System.out.println(Arrays.toString(nums));
    }

}
