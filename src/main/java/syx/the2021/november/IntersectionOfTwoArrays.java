package syx.the2021.november;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author syx
 * @className IntersectionOfTwoArrays
 * @description Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order
 * @url https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @tips Array、Hash Table、Two Pointers、Binary Search、Sorting
 * @date 2021/11/09 17:44
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[]{};
        Set<Integer> set = new HashSet<>();

        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return result;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int firstPoints = 0;
        int secondPoints = 0;
        while (firstPoints < nums1.length && secondPoints < nums2.length) {
            if (nums1[firstPoints] == nums2[secondPoints]) {
                set.add(nums1[firstPoints]);
                firstPoints++;
                secondPoints++;
                continue;
            }
            if (nums1[firstPoints] < nums2[secondPoints]) {
                firstPoints++;
            } else {
                secondPoints++;
            }
        }
        if (set.size() != 0) {
            Object[] objects = set.toArray();
            result = new int[objects.length];
            for (int i = 0; i < objects.length; i++) {
                result[i] = (int) objects[i];
            }
        }
        return result;
    }

}
