package com.healthcare.linkedlists.slowandfastpointers;

import com.healthcare.utils.ListNode;

public class IdentifyCycle {
    public static Boolean hasCycle(ListNode head){
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}


