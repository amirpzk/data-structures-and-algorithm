package challenges.stack;

import challenges.string.Palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinimumBracketToRemoveStack {

    public static String minimumBracketToRemove(String input) {
        if (input == null) return null;
        if (input.isBlank() || input.isEmpty()) return "";

        Stack<Character> stack = new Stack<>();
        List<Integer> elementsToBeRemoved = new ArrayList<>();

        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (stack.isEmpty()) {
                    chars[i] = '*';
                    continue;
                }

                stack.pop();
                elementsToBeRemoved.remove(elementsToBeRemoved.size() - 1);
                continue;
            }

            if (chars[i] == '(') {
                stack.add(chars[i]);
                elementsToBeRemoved.add(i);
            }
        }

        elementsToBeRemoved.forEach(i -> chars[i] = '*');

        StringBuilder s = new StringBuilder();
        for (char aChar : chars) {
            if (aChar != '*') {
                s.append(aChar);
            }
        }

        return s.toString();
    }
}
