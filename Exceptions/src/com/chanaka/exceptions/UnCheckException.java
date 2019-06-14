package com.chanaka.exceptions;

public class UnCheckException extends RuntimeException{

	//Uncheck Exception
	
	public UnCheckException(String message) {
		 super(message);
	}
	
	public UnCheckException(String message, Throwable cause) {
		 super(message,cause);
	}
}
