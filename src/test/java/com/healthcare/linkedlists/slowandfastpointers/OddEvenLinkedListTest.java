package com.healthcare.linkedlists.slowandfastpointers;

import com.healthcare.utils.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class OddEvenLinkedListTest {
    @Test
    void groupsOddPositionsBeforeEvenPositionsForAnOddLengthList() {
        ListNode head = listOf(1, 2, 3, 4, 5);

        assertEquals(List.of(1, 3, 5, 2, 4), valuesOf(OddEvenLinkedList.getOddEvenLinkedListOptimal(head)));
    }

    @Test
    void groupsOddPositionsBeforeEvenPositionsForAnEvenLengthList() {
        ListNode head = listOf(1, 2, 3, 4);

        assertEquals(List.of(1, 3, 2, 4), valuesOf(OddEvenLinkedList.getOddEvenLinkedListOptimal(head)));
    }

    @Test
    void preservesOrderForATwoNodeList() {
        ListNode head = listOf(1, 2);

        assertEquals(List.of(1, 2), valuesOf(OddEvenLinkedList.getOddEvenLinkedListOptimal(head)));
    }

    @Test
    void returnsTheSameNodeForASingleNodeList() {
        ListNode head = listOf(1);

        assertSame(head, OddEvenLinkedList.getOddEvenLinkedListOptimal(head));
    }

    @Test
    void returnsNullForAnEmptyList() {
        assertNull(OddEvenLinkedList.getOddEvenLinkedListOptimal(null));
    }

    private ListNode listOf(int... values) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        for (int value : values) {
            ListNode node = new ListNode();
            node.data = value;
            tail.next = node;
            tail = node;
        }
        return dummy.next;
    }

    private List<Integer> valuesOf(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.data);
            head = head.next;
        }
        return values;
    }
}
