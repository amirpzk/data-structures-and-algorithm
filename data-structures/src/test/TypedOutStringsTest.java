package test;

import challenges.string.Palindrome;
import challenges.string.TypedOutStrings;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TypedOutStringsTest {
    @Test
    public void testSubmission() throws Exception {
        assertTrue(TypedOutStrings.typedOutString("  ", "  "));
        assertTrue(TypedOutStrings.typedOutString("", ""));
        assertTrue(TypedOutStrings.typedOutString(null, null));
        assertTrue(TypedOutStrings.typedOutString("aabaa", "aabaa"));
        assertTrue(TypedOutStrings.typedOutString("aahk##aa", "aaaa"));
        assertTrue(TypedOutStrings.typedOutString("aahjk###aa", "aaaa"));
        assertFalse(TypedOutStrings.typedOutString("aabbccddkk", "aabbccddkk#"));
        assertFalse(TypedOutStrings.typedOutString("polkmnjjygvcftrdxzsewaq", "polkmnjjygvcftrdxzsewaq###"));
        assertFalse(TypedOutStrings.typedOutString("abvscujki", "abvscujk####i"));
    }
}
