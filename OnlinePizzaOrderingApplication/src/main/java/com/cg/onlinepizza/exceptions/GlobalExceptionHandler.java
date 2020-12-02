package com.cg.onlinepizza.exceptions;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.cg.onlinepizza.service.UserServiceImpl;

@ControllerAdvice
public class GlobalExceptionHandler {
	Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
	
	@ExceptionHandler(UserIdNotFoundException.class)
	public ResponseEntity<?>UserIdNotFoundException(UserIdNotFoundException e,WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(),e.getMessage(), request.getDescription(false));
		logger.trace("UserIdNotFoundException thrown");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
}
