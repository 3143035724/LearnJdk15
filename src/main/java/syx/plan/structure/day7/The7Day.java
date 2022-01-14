package syx.plan.structure.day7;

/**
 * 数据结构->十四天计划->第七天
 *
 * @author kixs
 * @version v1.0.0
 * @since 2021/12/26 15:05
 */
public class The7Day {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 21.合并两个有序链表
        // https://leetcode-cn.com/problems/merge-two-sorted-lists/
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode treeNode = new ListNode();
        ListNode node = treeNode;
        while (list1 != null || list2 != null) {
            int first = list1 == null ? 0 : list1.val;
            int second = list2 == null ? 0 : list2.val;
            // 两者相比
            if (first < second) {
                if (list1 != null) {
                    node.next = new ListNode(first);
                    list1 = list1.next;
                } else {
                    node.next = new ListNode(second);
                    list2 = list2.next;
                }
            } else {
                if (list2 != null) {
                    node.next = new ListNode(second);
                    list2 = list2.next;
                } else {
                    node.next = new ListNode(first);
                    list1 = list1.next;
                }
            }
            node = node.next;
        }
        return treeNode.next;
    }

    public ListNode removeElements(ListNode head, int val) {
        // 203.移除链表元素
        // https://leetcode-cn.com/problems/remove-linked-list-elements/
        if (head == null) {
            return head;
        }
        if (head.val == val) {
            head = head.next;
        }
        ListNode node = new ListNode(0);
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


