package syx.the2021.december.tree;

/**
 * @author syx
 * @className NumberBits
 * @description 191.位1的个数
 * @url https://leetcode-cn.com/problems/number-of-1-bits/
 * @tips 位运算
 * @date 2021/12/29 18:23
 */
public class NumberBits {

    public static void main(String[] args) {

    }

    public static int hammingWeight(long n) {
        int count = 0;
        while (n != 0) {
            int num = (int) (n % 2);
            n /= 2;
            if (num == 1) {
                count += 1;
            }
        }
        return count;
    }

}
