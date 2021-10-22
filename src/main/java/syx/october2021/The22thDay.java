package syx.october2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author syx
 * @className The22th
 * @description 求众数
 * @date 2021/10/22 14:06
 */
public class The22thDay {

    private static Map<Integer, Integer> countMap;

    /**
     * 题目：229.求众数 II
     * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
     * 相关标签：数组、哈希表、计数、排序
     */
    public List<Integer> majorityElement(int[] nums) {
        countMap = new HashMap<>(16);
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int count = nums.length / 3;
        countMap.forEach((key, value) -> {
            if (value > count) {
                list.add(key);
            }
        });
        return list;
    }
}
