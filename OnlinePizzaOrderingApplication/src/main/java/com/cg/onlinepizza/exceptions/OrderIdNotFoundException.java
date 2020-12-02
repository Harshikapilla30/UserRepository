package com.cg.onlinepizza.exceptions;

public class OrderIdNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderIdNotFoundException(Integer bookingOrderId) {
		System.out.println(bookingOrderId + " Not Found");


	}
}
