package com.cg.onlinepizza.exceptions;

import com.cg.onlinepizza.model.Coupan;

public class CoupanIdNotFoundException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public CoupanIdNotFoundException(int coupanId) {
	System.out.println(coupanId + " Not Found");
}
public CoupanIdNotFoundException(String message) {
	super(message);
}
public CoupanIdNotFoundException(Coupan coupan) {
	System.out.println(coupan + " Not Found");
	
}
}
