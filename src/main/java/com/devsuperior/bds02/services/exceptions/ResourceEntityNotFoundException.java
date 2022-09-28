package com.devsuperior.bds02.services.exceptions;

public class ResourceEntityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceEntityNotFoundException(String msg) {
		super(msg);
	}

}
