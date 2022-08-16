package challenges.linkedlist;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

    public static class ListNode {
        public ListNode next;
        public Integer val;

        public void setVal(Integer val) {
            this.val = val;
        }

        public void setNext(ListNode listNode) {
            this.next = listNode;
        }
    }
}
