package syx.the2021.december;

/**
 * @author syx
 * @className ValidPerfectSquare
 * @description Given a positive integer num, write a function which returns True if num is a perfect square else False
 * @url https://leetcode-cn.com/problems/valid-perfect-square/
 * @tips Math、Binary Search
 * @date 2021/12/23 15:36
 */
public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        // 367.有效的完全平方数
        //  Do not use any built-in library function such as sqrt
        if (num == 1) {
            return true;
        }
        int left = 1;
        int right = num / 2;
        while (left <= right) {
            long middle = left + (right - left) / 2;
            if (middle * middle == num) {
                return true;
            }
            if (middle * middle < num) {
                left = (int)middle + 1;
            } else {
                right = (int)middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        isPerfectSquare(808201);

        System.out.println(Math.sqrt(808201));
    }

}
