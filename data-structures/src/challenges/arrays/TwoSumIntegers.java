package challenges.arrays;

import java.util.HashMap;

public class TwoSumIntegers {

    public int[] returnIndices(final int[] array, final int target) {
        for (int i = 0; i < array.length; i++) {
            int find = target - array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == find) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public int[] returnIndicesAdvanced(final int [] array, final int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {

            if (map.containsKey(array[i])) {
                return new int[]{map.get(array[i]), i};
            } else {
                int find = target - array[i];
                map.put(find, i);
            }
        }

        return null;
    }
}
