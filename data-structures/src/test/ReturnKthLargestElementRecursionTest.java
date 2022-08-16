package test;

import challenges.recursion.ReturnKthLargestElementRecursion;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ReturnKthLargestElementRecursionTest {

    @Test
    public void testQuickSort() {

        int[] array = new int[]{1,3,2,5,4,7,6,8};
        ReturnKthLargestElementRecursion.quickSort(array, 0, 7);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }
}
