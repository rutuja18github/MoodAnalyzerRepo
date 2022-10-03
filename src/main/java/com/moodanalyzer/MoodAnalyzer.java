package com.moodanalyzer;

public class MoodAnalyzer {
	String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.equalsIgnoreCase("I am in Happy mood") || message.equalsIgnoreCase("I am in Any mood")) {
			return "Happy";
		} else {
			return "Sad";
		}
	}
}
