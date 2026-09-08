package com.healthcare.arrays.slowandfastpointers;

import com.healthcare.utils.ListNode;
import com.healthcare.linkedlists.slowandfastpointers.MiddleOfLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class MiddleOfLinkedListTest {
    @Test
    void returnsMiddleNodeForAnOddLengthList() {
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        ListNode middle = new ListNode();
        ListNode fourth = new ListNode();
        ListNode fifth = new ListNode();
        first.next = second;
        second.next = middle;
        middle.next = fourth;
        fourth.next = fifth;

        assertSame(middle, MiddleOfLinkedList.getMiddleOfLinkedList(first));
    }

    @Test
    void returnsSecondMiddleNodeForAnEvenLengthList() {
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        ListNode secondMiddle = new ListNode();
        ListNode fourth = new ListNode();
        first.next = second;
        second.next = secondMiddle;
        secondMiddle.next = fourth;

        assertSame(secondMiddle, MiddleOfLinkedList.getMiddleOfLinkedList(first));
    }

    @Test
    void returnsTheOnlyNodeForASingleNodeList() {
        ListNode onlyNode = new ListNode();

        assertSame(onlyNode, MiddleOfLinkedList.getMiddleOfLinkedList(onlyNode));
    }

    @Test
    void returnsNullForAnEmptyList() {
        assertNull(MiddleOfLinkedList.getMiddleOfLinkedList(null));
    }
}
