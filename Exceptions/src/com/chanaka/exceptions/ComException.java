package com.chanaka.exceptions;

public class ComException extends Exception {
	
	//Check Exception

	public ComException(String message) {
		 super(message);
	}
	
	public ComException(String message, Throwable cause) {
		 super(message,cause);
	}
}
