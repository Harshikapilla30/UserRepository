package com.cg.onlinepizza.exceptions;

public class UserIdNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UserIdNotFoundException(int Id) {
		System.out.println(Id + " Not Found");	
	}

	public UserIdNotFoundException(String message){
		super(message);
		
	}
}
