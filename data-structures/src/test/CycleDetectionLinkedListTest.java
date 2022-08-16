package test;

import challenges.linkedlist.CycleDetectionLinkedList;
import challenges.linkedlist.ReverseLinkedList;
import challenges.string.TypedOutStrings;
import org.junit.Test;

import static org.junit.Assert.*;

public class CycleDetectionLinkedListTest {
    @Test
    public void testSubmission() throws Exception {
        ReverseLinkedList.ListNode n0 = new ReverseLinkedList.ListNode();
        n0.val = 0;

        ReverseLinkedList.ListNode n1 = new ReverseLinkedList.ListNode();
        n1.val = 1;

        ReverseLinkedList.ListNode n2 = new ReverseLinkedList.ListNode();
        n2.val = 2;

        ReverseLinkedList.ListNode n3 = new ReverseLinkedList.ListNode();
        n3.val = 3;

        ReverseLinkedList.ListNode n4 = new ReverseLinkedList.ListNode();
        n4.val = 4;

        ReverseLinkedList.ListNode n5 = new ReverseLinkedList.ListNode();
        n5.val = 5;

        ReverseLinkedList.ListNode n6 = new ReverseLinkedList.ListNode();
        n6.val = 6;

        ReverseLinkedList.ListNode n7 = new ReverseLinkedList.ListNode();
        n7.val = 7;

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n3;

        assertNull(CycleDetectionLinkedList.tortesAndHare(null));
        assertEquals(n3, CycleDetectionLinkedList.tortesAndHare(n0));
    }
}
