package test;

import challenges.string.Palindrome;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testSubmission() throws Exception {
        assertTrue(Palindrome.isPalindrome("  "));
        assertTrue(Palindrome.isPalindrome(""));
        assertFalse(Palindrome.isPalindrome(null));
        assertTrue(Palindrome.isPalindrome("aabaa"));
        assertTrue(Palindrome.isPalindrome("aahkaa"));
        assertFalse(Palindrome.isPalindrome("aahjkaa"));
        assertFalse(Palindrome.isPalindrome("aabbccddkk"));
        assertFalse(Palindrome.isPalindrome("polkmnjjygvcftrdxzsewaq"));
        assertFalse(Palindrome.isPalindrome("abvscujki"));
    }
}
