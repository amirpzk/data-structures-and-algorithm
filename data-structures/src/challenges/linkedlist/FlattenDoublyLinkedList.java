package challenges.linkedlist;

public class FlattenDoublyLinkedList {

    public Node flattenLinkList(Node head) {
        if (head == null) {
            return head;
        }

        Node current = head;

        while (current.next != null || current.child != null) {
            if (current.child != null) {
                current = handleChileNode(current, current.next);
            }
            if (current.next != null) {
                current = current.next;
            }
        }

        return head;
    }

    public Node handleChileNode(Node current, Node next) {
        Node children = current.child;
        children.prev = current;
        current.next = children;
        while (children.next != null) {
            children = children.next;
        }
        children.next = next;
        if (next != null)
        next.prev = children;

        current.child = null;
        return current;
    }
}
