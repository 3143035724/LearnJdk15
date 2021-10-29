package syx.october2021;

/**
 * @author syx
 * @className The28thDay
 * @description
 * @date 2021/10/28 15:24
 */
public class The28thDay {

    /**
     * 题目：50. Pow(x, n)
     * 相关标签：递归、数字
     * 链接：https://leetcode-cn.com/problems/powx-n/
     */

    /**
     * 实现 Pow(x,n)
     *
     * @param x 需要计算的数
     * @param n 幂次方
     * @return 计算结果
     */
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double result = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                result *= x;
            }
            x *= x;
        }
        return n < 0 ? 1 / result : result;
    }


    public static void main(String[] args) {
        myPow(2.0, -2);
    }
}
