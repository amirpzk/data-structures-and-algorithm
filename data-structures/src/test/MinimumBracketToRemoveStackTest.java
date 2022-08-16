package test;

import challenges.stack.MinimumBracketToRemoveStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MinimumBracketToRemoveStackTest {

    @Test
    public void testSubmission() throws Exception {
//        assertNull(MinimumBracketToRemoveStack.minimumBracketToRemove(null));
//        assertEquals("", MinimumBracketToRemoveStack.minimumBracketToRemove(""));
//        assertEquals("", MinimumBracketToRemoveStack.minimumBracketToRemove(" "));
//        assertEquals("", MinimumBracketToRemoveStack.minimumBracketToRemove("        "));
//        assertEquals("(a(bcd)d)", MinimumBracketToRemoveStack.minimumBracketToRemove("(a(bcd)d)"));
//        assertEquals("(abcd)d", MinimumBracketToRemoveStack.minimumBracketToRemove("(abcd)d)"));
//        assertEquals("abc(d)d", MinimumBracketToRemoveStack.minimumBracketToRemove("(abc(d)d"));
        assertEquals("abc(d)d", MinimumBracketToRemoveStack.minimumBracketToRemove("(((abc(d)d"));
        assertEquals("abc(d)d", MinimumBracketToRemoveStack.minimumBracketToRemove("(a(b(c(d)d"));

    }
}
