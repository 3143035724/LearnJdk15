package syx.the2021.december.stackAndQueue.stack;

/**
 * @author syx
 * @className NextGreaterElement
 * @description 496.下一个更大元素
 * @url https://leetcode-cn.com/problems/next-greater-element-i/
 * @tips 栈、数组、哈希表、单调栈
 * @date 2021/12/28 11:15
 */
public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] firstMax = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            firstMax[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    // 此处存储的是索引
                    firstMax[i] = j;
                }
            }
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < firstMax.length; i++) {
            int equalIndex = firstMax[i];
            result[i] = -1;
            if (equalIndex == -1) {
                continue;
            }
            for (int j = equalIndex; j < nums2.length; j++) {
                if (nums2[j] > nums2[equalIndex]) {
                    result[i] = nums2[j];
                    j = nums2.length;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
    }

}
