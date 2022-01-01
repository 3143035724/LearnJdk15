package syx.the2021.december.linkedlist.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className RotateList
 * @description 61.旋转链表
 * @url https://leetcode-cn.com/problems/rotate-list/
 * @tips 链表、双指针
 * @date 2021/12/27 17:06
 */
public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {
        // TODO 未完成
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        List<Integer> list = new ArrayList<>();
        ListNode tmp = head;
        while (tmp != null) {
            list.add(tmp.val);
            tmp = tmp.next;
        }
        k = k % list.size();
        k = k % 2 == 0 ? k + 1 : k;
        List<Integer> end = list.subList(k, list.size());
        List<Integer> first = list.subList(0, k);
        if (end.size() == 0) {
            return head;
        }
        ListNode node = new ListNode(0);
        ListNode result = node;
        for (Integer integer : end) {
            result.next = new ListNode(integer, new ListNode());
            result = result.next;
        }
        for (Integer integer : first) {
            result.next = new ListNode(integer);
            result = result.next;
        }
        return node.next;
    }

    public static void main(String[] args) {
        rotateRight(new ListNode(1, new ListNode(2)), 1);
    }

}
