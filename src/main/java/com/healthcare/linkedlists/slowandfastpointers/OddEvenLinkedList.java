package com.healthcare.linkedlists.slowandfastpointers;


import com.healthcare.utils.ListNode;

import java.util.ArrayList;

public class OddEvenLinkedList {
    public static ListNode getOddEvenLinkedListBrute(ListNode head){
        if(head == null || head.next == null)  return head;
        ArrayList<Integer> nodesArray = new ArrayList<>();
        ListNode current = head;
        int position = 1;
        while(current.next != null){
            if(position % 2 == 1){
                nodesArray.add(current.data);
            }
            current = current.next;
            position += 1;
        }
        current = head;
        position = 1;
        while(current.next != null){
            if(position % 2 == 0){
                nodesArray.add(current.data);
            }
            current = current.next;
            position += 1;
        }

        ListNode dummy = new ListNode();
        dummy.data = 0;

        ListNode tail = dummy;

        for(int node: nodesArray){
            ListNode node1 = new ListNode();
            node1.data = node;
            tail.next = node1;
            tail = tail.next;
        }
        return head;
    }

    public static ListNode getOddEvenLinkedListOptimal(ListNode head){
        if(head== null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
