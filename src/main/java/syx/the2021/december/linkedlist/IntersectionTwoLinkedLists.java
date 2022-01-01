package syx.the2021.december.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author syx
 * @className IntersectionTwoLinkedLists
 * @description 160.相交链表
 * @url https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * @tips 哈希表、链表、双指针
 * @date 2021/12/27 14:06
 */
public class IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode node = headA;
        while (node != null) {
            nodeSet.add(node);
            node = node.next;
        }
        node = headB;
        while (node != null) {
            if (nodeSet.contains(node)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
//        getIntersectionNode(
//                new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))),
//                new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))))
//        );
    }

}


