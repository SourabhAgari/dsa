package com.healthcare.arrays.slowandfastpointers;

import com.healthcare.utils.ListNode;
import com.healthcare.linkedlists.slowandfastpointers.IdentifyCycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IdentifyCycleTest {
    @Test
    void returnsFalseForAnEmptyList() {
        assertFalse(IdentifyCycle.hasCycle(null));
    }

    @Test
    void returnsFalseForASingleNodeWithoutACycle() {
        ListNode head = new ListNode();

        assertFalse(IdentifyCycle.hasCycle(head));
    }

    @Test
    void returnsFalseForAMultiNodeListWithoutACycle() {
        ListNode head = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        head.next = second;
        second.next = third;

        assertFalse(IdentifyCycle.hasCycle(head));
    }

    @Test
    void returnsTrueWhenTheTailPointsBackToTheHead() {
        ListNode head = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        head.next = second;
        second.next = third;
        third.next = head;

        assertTrue(IdentifyCycle.hasCycle(head));
    }

    @Test
    void returnsTrueWhenCycleStartsInTheMiddleOfTheList() {
        ListNode head = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        ListNode fourth = new ListNode();
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        assertTrue(IdentifyCycle.hasCycle(head));
    }
}
