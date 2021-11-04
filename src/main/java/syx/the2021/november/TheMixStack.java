package syx.the2021.november;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className TheMixStack
 * @description TODO
 * @url
 * @tips
 * @date 2021/11/04 11:27
 */
public class TheMixStack {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println();
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        int params1 = obj.getMin();
        obj.pop();
        int params2 = obj.top();
        int params3 = obj.getMin();
        System.out.println(System.currentTimeMillis() - start);
    }

}

class MinStack {

    private List<Integer> list;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int val) {
        // 将元素 x 推入栈中
        list.add(val);
        // 对现有数据进行排序

    }

    public void pop() {
        // 删除栈顶的元素
        if (list.size() != 0) {
            list.remove(list.size() - 1);
        }
    }

    public int top() {
        // 获取栈顶元素
        return list.get(list.size() - 1);
    }

    public int getMin() {
        // 检索栈中的最小元素
        int min = list.get(0);
        for (Integer integer : list) {
            min = integer > min ? min : integer;
        }

        return min;
    }
}