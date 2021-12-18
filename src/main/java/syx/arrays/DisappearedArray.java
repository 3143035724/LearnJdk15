package syx.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 448.找到所有数组中消失的数字
 *
 * @author kixs
 * @version v1.0.0
 * @since 2021/12/18 18:21
 */
public class DisappearedArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // 要求：
        // 含有n个整数的数组nums，找到所有在[1,n]范围内但没有出现在nums中的数字

        // 以数组形式返回结果
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = findDisappearedNumbers(new int[]{1, 3, 5, 3, 2, 1, 7, 6, 5, 3});
        System.out.println(list);
    }

}
