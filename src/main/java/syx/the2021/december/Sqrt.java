package syx.the2021.december;

/**
 * @author syx
 * @className Sqrt
 * @description Given a non-negative integer x, compute and return the square root of x.
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 * @url https://leetcode-cn.com/problems/sqrtx/
 * @tips Math、Binary Search
 * @date 2021/12/20 13:51
 */
public class Sqrt {

    public int mySqrt(int x) {
        int left = 0, right = x, answer = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle * middle <= x) {
                // 向右
                answer = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return answer;
    }


}
