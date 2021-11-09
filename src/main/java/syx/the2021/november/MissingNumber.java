package syx.the2021.november;

/**
 * @author syx
 * @className MissingNumber
 * @description Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array
 * @url https://leetcode-cn.com/problems/missing-number/
 * @tips Bit Manipulation、Array、Hash Table、Math、Sorting
 * @date 2021/11/09 16:50
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int sum = 0;
        int total = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return total - sum;
        //        Arrays.sort(nums);
//
//        for (int i = 0; i < n; i++) {
//            if (i != nums[i]) {
//                return i;
//            }
//        }
//        if (nums[n - 1] != n) {
//            return n;
//        }
    }

    public static void main(String[] args) {
        missingNumber(new int[]{0, 1});
    }
}
