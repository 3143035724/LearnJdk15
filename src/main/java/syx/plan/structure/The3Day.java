package syx.plan.structure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author syx
 * @className The3Day
 * @description 数据结构->十四天计划->第三天
 * @url https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/、https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * @tips 350.两个数组的交集II、121.买卖股票的最佳时机
 * @date 2021/12/22 11:28
 */
public class The3Day {

    public int maxProfit(int[] prices) {
        // 买卖股票，售卖股票必须在买入股票之后
        int max = 0;
        int min = prices[0];
        for (int price : prices) {
            max = Math.max(max, price - min);
            min = Math.min(min, price);
        }
        return max;
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

        }
        if (nums2 == null || nums2.length == 0) {
            return new int[]{};
        }
        int[] nums = new int[nums2.length];
        int numsIndex = 0;
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                nums[numsIndex] = num;
                numsIndex++;
                map.replace(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOf(nums, numsIndex);
    }

    public static void main(String[] args) {
        intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    }
}
