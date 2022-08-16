package challenges.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ReversePortionLinkedList {

    public ReverseLinkedList.ListNode reversePortion(ReverseLinkedList.ListNode head, int start, int end) {
        int counter = 1;

        ReverseLinkedList.ListNode prev = null;
        ReverseLinkedList.ListNode current = head;

        while (counter < start) {
            prev = current;
            current = current.next;
            counter++;
        }

        ReverseLinkedList.ListNode tail = current;
        ReverseLinkedList.ListNode newList = null;

        while (start <= counter && counter <= end) {
            ReverseLinkedList.ListNode temp = current.next;
            current.next = newList;
            newList = current;
            current = temp;
            counter++;
        }

        if (prev != null) {
            prev.next = newList;
        }
        tail.next = current;

        if(start > 1) {
            return head;
        } else {
            return newList;
        }
    }
}
