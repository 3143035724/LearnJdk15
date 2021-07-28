package syx.basicAlgorithm;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

/**
 * @author syx
 * @className Second
 * @description 算法基础第二天：标签：二分查找
 * @date 2021/07/27 14:07
 */
public class Second {

    /**
     * 题目：153. 寻找旋转排序数组中的最小值
     */
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        // 不存在length为0或本身为null的情况，最小为1
        // 找到旋转位置，旋转位置为最小值
        int left = 0;
        int right = nums.length - 1, middle;
        int end = nums.length - 1;
        int index = 0;
        if (nums[left] > nums[right]) {
            // 排序类似[3,4,5,1,2]
            while (left <= right) {
                middle = (left + right) / 2;
                if (nums[middle] > nums[end]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
                min = Math.min(nums[middle], min);
            }
        } else {
            // 排序类似[1,2,3,4,5]
            min = nums[index];
        }
        return min;
    }

    @Test
    public void test() {
        findMin(new int[]{1, 2, 3, 4, 5});
    }

    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());

    }
}
