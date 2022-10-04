package com.moodanalyzer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "welcome to Mood Analyser!" );
        MoodAnalyzer moodAnalyzerObject = new MoodAnalyzer("");
        try {
        String mood=moodAnalyzerObject.analyseMood();
        logger.info("I am "+mood);
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
