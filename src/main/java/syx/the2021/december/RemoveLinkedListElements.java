package syx.the2021.december;

/**
 * @author syx
 * @className RemoveLinkedListElements
 * @description Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * @url https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @tips Recursion、LinkedList
 * @date 2021/12/20 15:41
 */
public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null || (head.val == val && head.next == null)) {
            return null;
        }
        ListNode node = new ListNode(0);
        // 通过初始化一个首节点，对其进行后续节点的操作，首节点可不必进行判断处理
        node.next = head;
        ListNode tmp = node;
        while (tmp.next != null) {
            if (tmp.next.val == val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return node.next;
    }

    public static void main(String[] args) {
//        removeElements(new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, null))))), 7);
        removeElements(new ListNode(7, new ListNode(6, new ListNode(7, new ListNode(9, new ListNode(7, null))))), 7);
        // 1, new ListNode(7, new ListNode(9, new ListNode(7, new ListNode(10, null))))
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
