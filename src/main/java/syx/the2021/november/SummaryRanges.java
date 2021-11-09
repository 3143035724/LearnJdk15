package syx.the2021.november;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className SummaryRanges
 * @description Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums
 * @url https://leetcode-cn.com/problems/summary-ranges/
 * @tips Array
 * @date 2021/11/09 14:30
 */
public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        if (nums.length == 1) {
            list.add(nums[0] + "");
            return list;
        }
        List<Integer> info = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (info.size() == 0) {
                info.add(nums[i]);
            } else {
                if (info.get(info.size() - 1) == nums[i] - 1) {
                    info.add(nums[i]);
                } else {
                    list.add(info.size() == 1 ? info.get(0) + "" : info.get(0) + "->" + info.get(info.size() - 1));
                    info = new ArrayList<>();
                    info.add(nums[i]);
                }
                if (i == nums.length - 1) {
                    list.add(info.size() == 1 ? info.get(0) + "" : info.get(0) + "->" + info.get(info.size() - 1));
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        summaryRanges(new int[]{1,2});
    }

}
