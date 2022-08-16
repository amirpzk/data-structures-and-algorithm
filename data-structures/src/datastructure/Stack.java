package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stack<T> implements Iterable<T> {

    private LinkedList<T> linkedList = new LinkedList<>();

    public Stack() {
    }

    public Stack(T firstElement) {
         push(firstElement);
    }

    public Stack(List<T> list) {
        list.forEach(this::push);
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T push(T data) {
        linkedList.addLast(data);
        return data;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack Is Empty");

        return linkedList.removeLast();
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack Is Empty");

        return linkedList.getLast();
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }
}
