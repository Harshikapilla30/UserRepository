package com.cg.onlinepizza.exceptions;

public class CustomerIdNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerIdNotFoundException(int customerId) {
		System.out.println(customerId + " Not Found");	
	}

	public CustomerIdNotFoundException(String message){
		super(message);
		
	}

}
