package test;

import challenges.string.LongestUniqueSubstring;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Copyright (C) 2022 Codesse. All rights reserved.
 * ••••••••••••••••••••••••••••••••••••••••••••••••
 */
public class LongestUniqueSubstringTest {



	@BeforeClass
	public static void oneTimeSetUp() {
//		validWords = new ValidWordsImpl();
	}

	@Before
	public void setUp() throws Exception {
//		service = new WordGeekImpl("areallylongwordhsiibabbreviatingo", validWords);
	}

	@Test
	public void testSubmission() throws Exception {
		assertEquals(1, LongestUniqueSubstring.longestUniqueSubstring("  "));
		assertEquals(0, LongestUniqueSubstring.longestUniqueSubstring(""));
		assertEquals(0, LongestUniqueSubstring.longestUniqueSubstring(null));
		assertEquals(4, LongestUniqueSubstring.longestUniqueSubstring("abcddcba"));
		assertEquals(2, LongestUniqueSubstring.longestUniqueSubstring("aabbccddkk"));
		assertEquals(16, LongestUniqueSubstring.longestUniqueSubstring("polkmnjjygvcftrdxzsewaq"));
		assertEquals(9, LongestUniqueSubstring.longestUniqueSubstring("abvscujki"));
	}

}
