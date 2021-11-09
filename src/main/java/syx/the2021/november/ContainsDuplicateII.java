package syx.the2021.november;

import java.util.HashSet;
import java.util.Set;

/**
 * @author syx
 * @className ContainsDuplicateII
 * @description Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * @url https://leetcode-cn.com/problems/contains-duplicate-ii/
 * @tips Array、Hash Table、Sliding Window
 * @date 2021/11/09 9:51
 */
public class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // 绝对值差至多为k
       /* if (nums == null || nums.length == 0) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length) {
                for (int j = i + 1; j <= k + i; j++) {
                    if (j < nums.length && nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
        }
        return result;*/
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
    }
}
