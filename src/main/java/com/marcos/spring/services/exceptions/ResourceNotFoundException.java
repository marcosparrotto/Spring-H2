package com.marcos.spring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Não foi possivel encontrar User com Id " + id);
	}
}
