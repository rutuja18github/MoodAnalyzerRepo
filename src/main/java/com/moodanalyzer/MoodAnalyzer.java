package com.moodanalyzer;

public class MoodAnalyzer {
	String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.equalsIgnoreCase("I am in Sad mood")) {
				return "Sad";
			} else {
				return "Happy";
			}
		} catch (Exception ex) {
			return "Happy";
		}
	}
}
