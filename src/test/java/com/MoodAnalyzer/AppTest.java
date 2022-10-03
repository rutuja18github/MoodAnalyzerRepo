package com.moodanalyzer;


import static org.junit.Assert.assertEquals;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{

	@Test
    public void CheckHappyMood() {
		MoodAnalyzer userObject = new MoodAnalyzer("I am in Sad mood");
        assertEquals("Sad", userObject.analyseMood());
    }
	
	@Test
    public void CheckForAnyMood() {
		MoodAnalyzer userObject = new MoodAnalyzer("I am in Happy mood");
        assertEquals("Happy", userObject.analyseMood());
    }

	@Test
    public void CheckMoodForNull() {
		MoodAnalyzer userObject = new MoodAnalyzer(null);
        assertEquals("Happy", userObject.analyseMood());
    }

}
