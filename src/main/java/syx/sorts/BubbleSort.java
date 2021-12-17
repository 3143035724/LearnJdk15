package syx.sorts;

import java.util.Arrays;

/**
 * @author syx
 * @className BubbleSort
 * @description 冒泡排序
 * @date 2021/12/17 11:15
 */
public class BubbleSort {

    public static void main(String[] args) {
        // 对一组数组进行冒泡排序
        int[] nums = new int[]{1, 3, 5, 4, 6, 7, 9, 11, 1, 23, 5, 4};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
