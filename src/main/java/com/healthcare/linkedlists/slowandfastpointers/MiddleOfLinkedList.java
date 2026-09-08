package com.healthcare.linkedlists.slowandfastpointers;

import com.healthcare.utils.ListNode;

public class MiddleOfLinkedList {
    public static ListNode getMiddleOfLinkedList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
