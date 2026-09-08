package com.healthcare.linkedlists.slowandfastpointers;

import com.healthcare.utils.ListNode;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode();
        dummy.data = 0;
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return dummy.next;
    }
}
