package syx.the2022.the1;

/**
 * @author syx
 * @className ValueOperation
 * @description 2011.执行操作后的变量值
 * @url https://leetcode-cn.com/problems/final-value-of-variable-after-performing-operations/
 * @tips 数组、字符串、模拟
 * @date 2022/01/22 10:37
 */
public class ValueOperation {

    public int finalValueAfterOperations(String[] operations) {
        int number = 0;
        char add = '+';
        for (String operation : operations) {
            if (operation.charAt(0) == add || operation.charAt(operation.length() - 1) == add) {
                number++;
            } else {
                number--;
            }
        }
        return number;
    }

}
