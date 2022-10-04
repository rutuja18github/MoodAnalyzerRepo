package com.moodanalyzer;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/*
	 * @Test public void CheckHappyMood() { MoodAnalyzer userObject = new
	 * MoodAnalyzer("I am in Sad mood"); assertEquals("Sad",
	 * userObject.analyseMood()); }
	 */

	@Test
	public void CheckForAnyMood() {
		MoodAnalyzer userObject = new MoodAnalyzer("I am in Happy mood");
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			assertEquals("Happy", userObject.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void CheckMoodForNull() {
		MoodAnalyzer userObject = new MoodAnalyzer(null);
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			assertEquals("Happy",userObject.analyseMood());
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExcpetionType.NULL_INPUT,e.excpetionType);
		}
	}
	@Test
	public void CheckMoodForEmpty() {
		MoodAnalyzer userObject = new MoodAnalyzer(null);
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			assertEquals("Happy",userObject.analyseMood());
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExcpetionType.EMPTY_INPUT,e.excpetionType);
		}
	}

}
