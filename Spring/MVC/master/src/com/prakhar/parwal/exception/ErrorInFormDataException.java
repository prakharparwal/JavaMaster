package com.prakhar.parwal.exception;

public class ErrorInFormDataException extends Exception {

	private String message;
	
	public ErrorInFormDataException(String errorMessage) {
		super(errorMessage);
		this.message = errorMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorInFormDataException [message=" + message + "]";
	}
	
	
}
