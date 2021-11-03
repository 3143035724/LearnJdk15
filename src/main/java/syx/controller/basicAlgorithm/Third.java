package syx.controller.basicAlgorithm;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author syx
 * @className Third
 * @description 算法基础第三天：双指针
 * @date 2021/07/29 15:49
 */
public class Third {

    /**
     * 题目：82.删除排序链表中的重复元素 II
     * 相关标签：链表、双指针
     * 实现方式：栈
     */
    @Test
    public void test() {
        deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, null)))))));
    }

//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        ListNode result = new ListNode(0, head);
//        ListNode operation = result;
//
//        while (operation.next != null && operation.next.next != null) {
//            // 是否存在值
//            if (operation.next.val == operation.next.next.val) {
//                int i = operation.next.val;
//                while (operation.next != null && operation.next.val == i) {
//                    // 去除连续的重复值
//                    operation.next = operation.next.next;
//                }
//            } else {
//                operation = operation.next;
//            }
//        }
//        return result.next;
//    }

    //    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        ListNode result = new ListNode(0, head);
//        ListNode operation = result;
//
//        while (operation.next != null && operation.next.next != null) {
//            // 是否存在值
//            int remove = operation.next.val;
//            if (remove == operation.next.next.val) {
//                // 此处必须使用while，将存在相同值的全部进行移除
//                while (operation.next != null && operation.next.val == remove) {
//                    operation.next = operation.next.next;
//                }
//            } else {
//                operation = operation.next;
//            }
//        }
//        return result.next;
//    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Boolean> map = new HashMap<>(16);
        stack.push(head.val);
        map.put(head.val, true);
        ListNode operation = head.next;
        while (operation != null) {
            if (!stack.isEmpty() && stack.peek() == operation.val) {
                stack.pop();
            } else if (map.containsKey(operation.val)) {

            } else {
                stack.push(operation.val);
                map.put(operation.val, true);
            }
            operation = operation.next;
        }
        ListNode info = null;
        while (!stack.isEmpty()) {
            info = new ListNode(stack.pop(), info);
        }
        return info;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}