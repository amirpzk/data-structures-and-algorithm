package test;

import challenges.recursion.BinarySearchRecursion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};

        assertEquals(2, BinarySearchRecursion.binarySearch(array, 2));
        assertEquals(9, BinarySearchRecursion.binarySearch(array, 9));
        assertEquals(5, BinarySearchRecursion.binarySearch(array, 5));
        assertEquals(3, BinarySearchRecursion.binarySearch(array, 3));
        assertEquals(7, BinarySearchRecursion.binarySearch(array, 7));
        assertEquals(-1, BinarySearchRecursion.binarySearch(array, 11));


    }
}
