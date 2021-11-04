package syx.the2021.november;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author syx
 * @className ContainsDuplicate
 * @description Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
 * @url https://leetcode-cn.com/problems/contains-duplicate/
 * @tips Arrays HashTable Sorting
 * @date 2021/11/04 14:00
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        int now = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (now == nums[i]) {
                return true;
            }
            now = nums[i];
        }
        return false;
    }

}
