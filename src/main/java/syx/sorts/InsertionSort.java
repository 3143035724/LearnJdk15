package syx.sorts;

import java.util.Arrays;

/**
 * @author syx
 * @className InsertionSort
 * @description 插入排序
 * @date 2021/12/17 13:56
 */
public class InsertionSort {
    public static void main(String[] args) {
        // 实现插入排序
        // 轮番和前面元素进行比较
        int[] nums = new int[]{1, 3, 5, 4, 6, 7, 9, 11, 1, 23, 5, 4};
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            // 定义假设插入位置的元素为当前元素
            int temp = nums[i];
            while (j >= 0 && temp < nums[j]) {
                // 如果要插入的元素小于第j个元素，也就是说，需要交换的位置和前一个相比，如果数值小，需要对数据进行前移
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
