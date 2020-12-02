package com.cg.onlinepizza.exceptions;

public class PizzaIdNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PizzaIdNotFoundException(int pizzaId) {
		// TODO Auto-generated constructor stub
		System.out.println(pizzaId+"Not found");
	}

	public PizzaIdNotFoundException(String message) {
		super(message);
	}
}
