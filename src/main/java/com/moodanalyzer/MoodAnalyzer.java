package com.moodanalyzer;

public class MoodAnalyzer {
	String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.isEmpty()) {
				throw new MoodAnalysisException(MoodAnalysisException.ExcpetionType.EMPTY,
						                        "Please enter proper message because message is empty");
			}
			if (message.equalsIgnoreCase("I am in Sad mood")) {
				return "Sad";
			} 
			return "Happy";
		} catch (NullPointerException ex) {
			throw new MoodAnalysisException(MoodAnalysisException.ExcpetionType.NULL,"Please enter proper message");
		}
	}
}
