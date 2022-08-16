package datastructure;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        T data;
        Node<T> next, prev;

        public Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    // clear all
    public void clear() {
        Node<T> trav = this.head;
        while (trav != null) {
            Node<T> next = trav.next = null;
            trav.prev = null;
            trav.data = null;

            trav = next;
        }
        head = tail = trav = null;
        size = 0;
    }

    public void addFirst(T data) {
        if (isEmpty()) {
            head = tail = new Node<>(data, null, null);
        } else {
            head.prev = new Node<>(data, head, null);
            head = head.prev;
        }

        ++size;
    }

    public void add(T data) {
        if (head == null && tail == null) {
            tail = head = new Node<>(data, null, null);
        } else {
            tail.next = new Node<>(data, null, tail);
        }
        ++size;
    }

    public void addLast(T data) {
        if (isEmpty()) {
            head = tail = new Node<>(data, null, null);
        } else {
            tail.next = new Node<>(data, null, tail);
            tail = tail.next;
        }
        ++size;
    }

    public T peekFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return head.data;
    }

    public T peekLast() {
        if (isEmpty()) throw new RuntimeException("Empty List");
        return tail.data;
    }

    public T removeFirst() {
        if (isEmpty()) throw new RuntimeException("Empty List");
        T data = head.data;
        head = head.next;
        --size;

        if (isEmpty()) tail = null;
        else head.prev = null;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) throw new RuntimeException("Empty List");
        T data = tail.data;
        tail = tail.prev;
        --size;

        if (isEmpty()) head = null;
        else tail.next = null;
        return data;
    }

    public T remove(Node<T> node) {
        if (isEmpty()) throw new RuntimeException("Empty List");
        T data = node.data;

        if (node.next == null) return removeLast();
        if (node.prev == null) return removeFirst();

        Node<T> next = node.next;
        Node<T> prev = next.prev;
        prev.next = next;
        next.prev = prev;
        node.data = null;
        node.prev = node.next = null;

        --size;

        return data;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
