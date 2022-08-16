package challenges.arrays;

public class TrappingRainwater {

    public int trappingRainWater(final int[] heights) {
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int maxLeft = 0, maxRight = 0, p1 = i, p2 = i;

            while (p1 >= 0) {
                maxLeft = Math.max(maxLeft, heights[p1]);
                p1--;
            }

            while (p2 < heights.length) {
                maxRight = Math.max(maxRight, heights[p2]);
                p2++;
            }

            int currentArea = Math.min(maxLeft, maxRight) - heights[i];
            if (currentArea > 0) {
                maxArea += currentArea;
            }
        }

        return maxArea;
    }

    public int trappingRainWaterOptimized(final int[] heights) {
        int maxArea = 0;

        int maxLeft = 0, maxRight = 0, p1 = 0, p2 = heights.length - 1;

        while (p1 < p2 - 1) {
            if (heights[p1] < heights[p2]) {
                // updating the maxLeft
                if (maxLeft < heights[p1]) {
                    maxLeft = heights[p1];
                }
                p1++;
                int currentArea = maxLeft - heights[p1];
                if (currentArea > 0) {
                    maxArea += currentArea;
                }
            }
//            else if (heights[p1] == heights[p2]) {
//                // updating the maxLeft
//                if (maxLeft < heights[p1]) {
//                    maxLeft = heights[p1];
//                }
//                p1++;
//                int currentArea = maxLeft - heights[p1];
//                if (currentArea > 0) {
//                    maxArea += currentArea;
//                }
//            }
            else {
                // updating the maxRight
                if (maxRight < heights[p2]) {
                    maxRight = heights[p2];
                }
                p2--;
                int currentArea = maxRight - heights[p2];
                if (currentArea > 0) {
                    maxArea += currentArea;
                }
            }
        }


        return maxArea;
    }
}
