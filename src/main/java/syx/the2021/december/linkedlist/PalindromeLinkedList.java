package syx.the2021.december.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className PalindromeLinkedList
 * @description 234.回文链表
 * @url https://leetcode-cn.com/problems/palindrome-linked-list/
 * @tips 栈、递归、链表、双指针
 * @date 2021/12/27 14:51
 */
public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        // 初始
        if (head == null || head.next == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        boolean palindrome = isPalindrome(new ListNode(1, new ListNode(2)));
        System.out.println(palindrome);
    }

}
