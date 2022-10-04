package com.moodanalyzer;

public class MoodAnalysisException extends Exception {

	enum ExcpetionType {
		NULL_INPUT, EMPTY_INPUT

	}

	ExcpetionType excpetionType;

	public MoodAnalysisException(ExcpetionType excpetionType,String message) {
		super(message);
	}
}
