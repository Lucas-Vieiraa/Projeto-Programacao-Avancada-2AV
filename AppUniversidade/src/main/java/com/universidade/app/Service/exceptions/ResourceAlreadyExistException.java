package com.universidade.app.Service.exceptions;

public class ResourceAlreadyExistException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public ResourceAlreadyExistException(String msg) {
		super(msg);
	}
}
