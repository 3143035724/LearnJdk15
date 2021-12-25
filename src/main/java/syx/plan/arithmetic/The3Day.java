package syx.plan.arithmetic;

/**
 * 算法->十四天计划->第三天
 *
 * @author kixs
 * @version v1.0.0
 * @since 2021/12/25 16:36
 */
public class The3Day {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        // 283.移动零
        // https://leetcode-cn.com/problems/move-zeroes/
        // 标签：双指针
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index != i) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        // 167. 两数之和II-输入有序数组
        // https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
        if (numbers == null || numbers.length == 0) {
            return new int[]{};
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
            if (target - numbers[left] > numbers[right]) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

}
