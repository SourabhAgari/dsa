package com.healthcare.linkedlists.slowandfastpointers;

import com.healthcare.utils.ListNode;

public class LinkedListIntersection {

    public ListNode getIntersectionNodeBrute(ListNode headA, ListNode headB){
        ListNode pA = headA;
        while(pA != null) {
            ListNode pB = headB;
            while (pB != null){
                if(pA == pB){
                    return pA;
                }
                pB = pB.next;
            }
            pA = pA.next;
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode pointA = headA;
        ListNode pointB = headB;

        while (pointA != pointB){
            if(pointA == null){
                pointA = headB;
            } else pointA = pointA.next;

            if(pointB == null){
                pointB = headA;
            } else pointB = pointB.next;
        }
        return pointA;
    }
}
