package com.cg.onlinepizza.exceptions;

public class InvalidMinCostException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public InvalidMinCostException(double mincost) {
	System.out.println(mincost+"INVALID Cost");
	// TODO Auto-generated constructor stub
}
public InvalidMinCostException(String message) {
	super(message);
}
}
