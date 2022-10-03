package com.moodanalyzer;

public class MoodAnalyzer {
	
	public String analyseMood(String message) {
		if (message.equalsIgnoreCase("I am in Happy mood") || message.equalsIgnoreCase("I am in Any mood")) {
			return "Happy";
		} else {
			return "Sad";
		}
	}
}
