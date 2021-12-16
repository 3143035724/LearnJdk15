package syx.the2021.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author syx
 * @className LargestDivisibleSubset
 * @description Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies
 * answer[i] % answer[j] == 0 or answer[j] % answer[i] == 0
 * If there are multiple solutions, return any of them
 * @url https://leetcode-cn.com/problems/largest-divisible-subset/
 * @tips Array、Math、DynamicProgramming、Sorting
 * @date 2021/12/16 11:22
 */
public class LargestDivisibleSubset {

    // TODO 没有任何思路
    // 368. 最大整除子集

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<Integer> optional = new ArrayList<>();

        for (int length = nums.length - 1; length >= 0; length--) {
            if (optional.size() == 0 || valid(optional, nums[length])) {
                optional.add(nums[length]);
            }
            if (length == 0) {
                list = optional;
                optional = new ArrayList<>();
            }
        }

        return list;
    }

    private static boolean valid(List<Integer> optional, int nums) {
        if (optional.size() == 0) {
            return true;
        }
        for (int i = 0; i < optional.size(); i++) {
            if (!(optional.get(i) % nums == 0 || nums % optional.get(i) == 0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        largestDivisibleSubset(new int[]{4, 8, 10, 240});
    }

}
