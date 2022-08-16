package challenges.string;

public class Palindrome {

    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        int right = input.length() - 1, left = 0, lengthLeft, lengthRight;
        input = input.replaceAll("[^a-zA-Z]+", " ");
        if (input.length() <= 2 || input.isBlank()) {
            return true;
        }

        while (left < right) {
            if ((left < input.length() - 1 && right >= 0) && input.charAt(left) != input.charAt(right)) {
                boolean firstCheck = valid(input.subSequence(left + 1, right + 1).toString());
                boolean secondCheck = valid(input.subSequence(left, right).toString());
                return firstCheck || secondCheck;
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean valid(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (left < input.length() - 1 && right >= 0 && input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
