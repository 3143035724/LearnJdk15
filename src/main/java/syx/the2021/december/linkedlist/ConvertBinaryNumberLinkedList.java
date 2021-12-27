package syx.the2021.december.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className ConvertBinaryNumberLinkedList
 * @description 1290.二进制链表转十进制
 * @url https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * @tips 链表、数学
 * @date 2021/12/27 15:25
 */
public class ConvertBinaryNumberLinkedList {

    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int sum = 0;
        int ten = 0;
        for (int index = list.size() - 1; index >= 0; index--) {
            sum += (list.get(index) * Math.pow(2, ten));
            ten++;
        }
        return sum;
    }


}
