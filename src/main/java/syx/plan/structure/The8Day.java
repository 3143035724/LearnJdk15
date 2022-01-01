package syx.plan.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className The8Day
 * @description 数据结构->十四天计划->第八天
 * @url https://leetcode-cn.com/problems/reverse-linked-list/、https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * @tips 206.反转链表、83.删除排序链表中的重复元素
 * @date 2021/12/27 9:20
 */
public class The8Day {

    public static void main(String[] args) {
//        reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
//        reverseList1(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(5, new ListNode(5))))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        // 83.删除排序链表中的重复元素
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static ListNode reverseList1(ListNode head) {
        // 206.反转链表 初始版本
        if (head == null || head.next == null) {
            return head;
        }

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode node = new ListNode(0);
        ListNode tmp = node;
        for (int i = list.size() - 1; i >= 0; i--) {
            tmp.next = new ListNode(list.get(i));
            tmp = tmp.next;
        }
        return node.next;
    }

    public static ListNode reverseList(ListNode head) {
        // 206.反转链表 优化版本(递归)
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
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