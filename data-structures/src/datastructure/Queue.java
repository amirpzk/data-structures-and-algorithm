package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Queue<T> implements Iterable<T>{
    LinkedList<T> linkedList = new LinkedList<>();

    public Queue() {}

    public Queue(T data) {
        offer(data);
    }

    public Queue(List<T> list) {
        list.forEach(this::offer);
    }

    public T offer(T data) {
        linkedList.addLast(data);
        return data;
    }

    public T poll(T data) {
        if (isEmpty()) throw new RuntimeException("Queue Is Empty");
        return linkedList.removeFirst();
    }

    public T peek() {
        return linkedList.getLast();
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }
}
