package challenges.linkedlist;

import java.util.Objects;

public class CycleDetectionLinkedList {
    public static ReverseLinkedList.ListNode tortesAndHare(ReverseLinkedList.ListNode head) {
        if (head == null || head.next == null) return null;

        ReverseLinkedList.ListNode tort = head;
        ReverseLinkedList.ListNode hare = head.next;

        while (!Objects.equals(tort.val, hare.val)) {
            if (hare.next == null || hare.next.next == null) return null;
            hare = hare.next.next;
            tort = tort.next;
        }

        ReverseLinkedList.ListNode meetingNode= tort;
        ReverseLinkedList.ListNode headNode = head;

        while (!Objects.equals(meetingNode.val, headNode.val)) {
            headNode = headNode.next;
            meetingNode = meetingNode.next;
        }

        return meetingNode;
    }
}
