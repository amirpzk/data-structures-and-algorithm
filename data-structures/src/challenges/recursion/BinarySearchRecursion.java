package challenges.recursion;

public class BinarySearchRecursion {
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = (int) Math.floor((right + left) / 2);
            int foundMid = array[mid];
            if (foundMid == target) {
                return mid;
            } else if (target < foundMid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
