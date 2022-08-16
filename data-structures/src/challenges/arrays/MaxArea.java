package challenges.arrays;

public class MaxArea {

    public int maxArea(final int[] heights) {
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int area = Math.min(heights[i], heights[j]) * (j - i);
                maxArea = Math.max(area, maxArea);
            }
        }

        return maxArea;
    }

    // min(a , b) * (bi - ai)
    public int maxArrayOptimized(final int[] heights) {
        int maxArea = 0;
        // remember if you don't subtract length by 1, you'll get an out of bound err
        int p1 = 0, p2 = heights.length - 1;

        while (p1 < p2) {
            int height = Math.min(heights[p1], heights[p2]);
            int length = p2 - p1;
            maxArea = Math.max(height * length, maxArea);

            // because in the formula the min of heights has the final impact
            if (heights[p1] <= heights[p2]) {
                // decrease the length which is the second element that had impact on the formula
                p1++;
            } else {
                // decrease the length which is the second element that had impact on the formula
                p2--;
            }
        }

        return maxArea;
    }
}
