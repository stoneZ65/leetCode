package com.demo.test.demo.leetCode;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Palindrome {

    public class ListNode {
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

    public static boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(head.val);
            curr = curr.next;
        }

        int front = 0, back = arr.size() - 1;
        while (front < back) {
            if (!arr.get(front).equals(arr.get(back))) {
                return false;

            }
            front++;
            back--;
        }
        return true;
    }

}
