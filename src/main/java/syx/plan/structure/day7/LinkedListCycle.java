package syx.plan.structure.day7;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kixs
 * @version v1.0.0
 * @since 2021/12/26 16:32
 */
public class LinkedListCycle {

    public boolean hasCycle(CycleListNode head) {
        // 141.环形链表
        // https://leetcode-cn.com/problems/linked-list-cycle/
        Set<CycleListNode> set = new HashSet<>();
        CycleListNode node = head;
        while (node != null) {
            if (!set.add(node)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

}

class CycleListNode {
    int val;
    CycleListNode next;

    CycleListNode(int x) {
        val = x;
        next = null;
    }
}