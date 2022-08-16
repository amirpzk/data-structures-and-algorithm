import challenges.linkedlist.FlattenDoublyLinkedList;
import challenges.linkedlist.Node;
import challenges.linkedlist.ReverseLinkedList;
import challenges.linkedlist.ReversePortionLinkedList;
import challenges.string.LongestUniqueSubstring;

public class Main {
    public static void main(String[] args) {
        LongestUniqueSubstring typedOutString = new LongestUniqueSubstring();

        Node h0 = new Node();
        h0.prev = null;
        h0.val = 0;

        Node h1 = new Node();
        h0.next = h1;
        h1.prev = h0;
        h1.val = 1;

        Node c0 = new Node();
        c0.val = 2;
        c0.prev = null;

        Node c1 = new Node();
        c1.val = 3;
        c1.prev = c0;
        c0.next = c1;
        c1.next = null;

        h1.child = c0;
        System.out.println(new FlattenDoublyLinkedList().flattenLinkList(h0));
    }
}
