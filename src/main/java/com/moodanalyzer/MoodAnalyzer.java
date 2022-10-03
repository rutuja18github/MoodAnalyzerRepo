package com.moodanalyzer;

public class MoodAnalyzer {
	String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.equalsIgnoreCase("I am in Sad mood")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}
}
