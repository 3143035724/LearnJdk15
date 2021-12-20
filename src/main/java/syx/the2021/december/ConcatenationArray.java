package syx.the2021.december;

/**
 * @author syx
 * @className ConcatenationArray
 * @description 1929.数组串联
 * @url https://leetcode-cn.com/problems/concatenation-of-array/
 * @tips Array
 * @date 2021/12/20 14:29
 */
public class ConcatenationArray {

    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] copyNums = new int[length * 2];
        for (int i = 0; i < length; i++) {
            copyNums[length + i] = nums[i];
            copyNums[i] = nums[i];
        }
        return copyNums;
    }

/*    public int[] getConcatenation(int[] nums) {
        int[] copyNums = Arrays.copyOf(nums, nums.length * 2);
        for (int length = nums.length - 1; length >= 0; length--) {
            copyNums[nums.length + length] = nums[length];
        }
        return copyNums;
    }*/

}
