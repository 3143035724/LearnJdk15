package syx.the2021.december.linkedlist.medium;

/**
 * @author syx
 * @className SwapNodesPairs
 * @description 24. 两两交换链表中的节点
 * @url https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @tips 递归、链表
 * @date 2021/12/27 16:47
 */
public class SwapNodesPairs {

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        int count = 1;
        while (node.next != null) {
            if (count % 2 != 0) {
                int tmp = node.val;
                node.val = node.next.val;
                node.next.val = tmp;
            }
            count++;
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
    }

}
