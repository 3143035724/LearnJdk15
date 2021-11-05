package syx.the2021.november;

import java.util.HashMap;
import java.util.Map;

/**
 * @author syx
 * @className TwoSum
 * @description Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * @url https://leetcode-cn.com/problems/two-sum/
 * @tips Array HashTable
 * @date 2021/11/05 9:15
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);

        }
        return result;
    }

}
