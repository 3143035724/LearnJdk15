package syx.plan.arithmetic;

/**
 * @author syx
 * @className The5Day
 * @description 算法->十四天计划->第五天
 * @url https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * @tips 19.删除链表的第N个节点
 * @date 2021/12/27 18:01
 */
public class The5Day {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }
        if (head.next == null && n == 1) {
            return null;
        }
        ListNode reverse = new ListNode(0, reverse(head));
        ListNode tmp = reverse;
        int count = 1;
        while (tmp.next != null) {
            if (count == n) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
            count++;
        }
        return reverse(reverse.next);
    }

    public static void main(String[] args) {
        removeNthFromEnd(new ListNode(1, new ListNode(2)), 2);
    }

    private static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverse(head.next);
        head.next.next = head;
        // 设置下一个节点，防止重复循环消费
        head.next = null;
        return node;
    }

}
