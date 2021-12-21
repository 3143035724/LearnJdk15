package syx.plan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author syx
 * @className The2Day
 * @description 十四天计划-第二天
 * @url https://leetcode-cn.com/problems/two-sum/、https://leetcode-cn.com/problems/merge-sorted-array/
 * @tips 1.两数之和、88.合并两个有序数组
 * @date 2021/12/21 17:45
 */
public class The2Day {


    public int[] twoSum(int[] nums, int target) {
        // 1.两数之和

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 88.合并两个有序数组
        // 两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目
        // 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列
        if (m == nums1.length) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }
        // 当两个数组都有值的时候
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i - m];
        }
        // 对nums1进行排序
        Arrays.sort(nums1);
    }

}
