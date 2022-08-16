package challenges.string;

import java.util.HashMap;

public class LongestUniqueSubstring {

    public static int longestUniqueSubstring(String input) {
        int longestLength = 0;
        int left = 0, right = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        if (input == null || input.length() <= 0) {
            return 0;
        }

        if (input.isBlank()) {
            return 1;
        }

        while (right <= input.length() - 1) {
            char currentChar = input.charAt(right);
            Integer previouslySeenChar = map.get(currentChar);

            if (previouslySeenChar != null && previouslySeenChar >= left) {
                left = previouslySeenChar + 1;
            }

            map.put(currentChar, right);
            longestLength = Math.max(longestLength, right - left + 1);
            right++;
        }

        return longestLength;
    }
}
