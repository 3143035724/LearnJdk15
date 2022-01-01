package syx.the2021.december.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className MiddleLinkedList
 * @description 876.链表的中间节点
 * @url https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @tips 链表、双指针
 * @date 2021/12/27 15:12
 */
public class MiddleLinkedList {

    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() / 2);
    }

    public static void main(String[] args) {
        ListNode listNode = middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        System.out.println(listNode);
    }

}
