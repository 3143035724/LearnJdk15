package syx.plan.arithmetic;

/**
 * @author syx
 * @className ListNode
 * @description 链表共用实体
 * @date 2021/12/27 14:50
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}
