package syx.the2021.december.stackAndQueue.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className BuildArrayWithStack
 * @description 1441.用栈操作构建数组
 * @url https://leetcode-cn.com/problems/build-an-array-with-stack-operations/
 * @tips 栈、数组、模拟
 * @date 2021/12/29 9:53
 */
public class BuildArrayWithStack {

    public static void main(String[] args) {
        buildArray(new int[]{1, 2, 3}, 3);
    }


    public static List<String> buildArray(int[] target, int n) {
        n = Math.min(target[target.length - 1], n);
        List<String> list = new ArrayList<>();
        int index = 1;
        for (int i = 0; i < target.length; i++) {
            while (target[i] != index) {
                list.add("Push");
                list.add("Pop");
                index++;
            }
            list.add("Push");
            index++;
        }
        if (index != n) {
            for (int i = index; i <= n; i++) {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }

}
