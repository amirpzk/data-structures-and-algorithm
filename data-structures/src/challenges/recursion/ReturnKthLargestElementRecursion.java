package challenges.recursion;

public class ReturnKthLargestElementRecursion {

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int partitionIndex = left;
        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                swap(array, partitionIndex, j);
                partitionIndex++;
            }
        }

        swap(array, partitionIndex, right);
        return partitionIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
