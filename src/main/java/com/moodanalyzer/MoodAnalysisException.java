package com.moodanalyzer;

public class MoodAnalysisException extends Exception {

	enum ExcpetionType {
		NULL,EMPTY

	}

	ExcpetionType excpetionType;

	public MoodAnalysisException(ExcpetionType excpetionType,String message) {
		super(message);
		this.excpetionType = excpetionType;
	}
}
