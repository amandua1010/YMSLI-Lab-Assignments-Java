package com.bookstore.exception;

public class DataAccessException extends RuntimeException {
	
	private static final long serialVersionUID = 4103758753331483718L;

	public DataAccessException(String message) {
		super(message);
	}
	
}
