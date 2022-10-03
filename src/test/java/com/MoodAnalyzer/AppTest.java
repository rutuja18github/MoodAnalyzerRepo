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
		MoodAnalyzer userObject = new MoodAnalyzer();
        assertEquals("Sad", userObject.analyseMood("I am in Happy sad"));
    }
	
	@Test
    public void CheckForAnyMood() {
		MoodAnalyzer userObject = new MoodAnalyzer();
        assertEquals("Happy", userObject.analyseMood("I am in Any mood"));
    }

}
