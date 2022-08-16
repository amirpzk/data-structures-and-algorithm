package datastructure;

import java.util.*;

public class MinHeap<T extends Comparable<T>> {
    int heapSize, heapCapacity = 0;
    List<T> heap;
    Map<T, TreeSet<Integer>> map = new HashMap<>();

    public MinHeap(int size) {
        heapCapacity = size;
        heap = new ArrayList<>(size);
    }

    public MinHeap(T[] elements) {
        heapSize = heapCapacity = elements.length;
        heap = new ArrayList<>(heapSize);
        for (int i = 0; i < elements.length; i++) {
            heap.add(elements[i]);
        }
    }

    public void sink(int k) {
        int left = Math.multiplyExact(2, k) + 1;
        int right = Math.multiplyExact(2, k) + 2;
//        int smallest =,
    }
}
