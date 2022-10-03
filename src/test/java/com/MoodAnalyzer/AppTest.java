package com.MoodAnalyzer;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.moodanalyzer.MoodAnalyzer;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void validationForFirstName() {
		MoodAnalyzer userObject = new MoodAnalyzer();
        assertEquals("Happy", userObject.analyseMood("I am in Happy mood"));
    }
	
	@Test
    public void validationWithInvalidInputFirstName() {
		MoodAnalyzer userObject = new MoodAnalyzer();
        assertEquals("Happy", userObject.analyseMood("I am in Any mood"));
    }
}
