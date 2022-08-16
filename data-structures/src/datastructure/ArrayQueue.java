package datastructure;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayQueue implements Iterable<Object> {
    final int DEFAULT_SIZE = 5;
    Object[] array;

    public ArrayQueue() {
        array = new Object[DEFAULT_SIZE];
    }

    public ArrayQueue(Object t, int size) {
        assert size > 0;
        array = new Object[size];
        array[0] = t;
    }

    public ArrayQueue(Object[] array) {
        this.array = array;
    }

    public int size() {
        return array.length + 1;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

//    public Object offer() {
//        if (isEmpty()) throw new RuntimeException("ERR");
//        if (array.length )
//    }

    @Override
    public Iterator<Object> iterator() {
        final AtomicInteger counter = new AtomicInteger(0);
        return new Iterator<Object> () {
            @Override
            public boolean hasNext() {
                return counter.get() + 1 < array.length;
            }

            @Override
            public Object next() {
                if (counter.get() + 1 >= array.length) throw new RuntimeException("ERR");
                return array[counter.incrementAndGet()];
            }
        };
    }
}
