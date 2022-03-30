package com.user.define.exception.restcontroller.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.user.define.exception.api.error.ApiError;
import com.user.define.exception.userdefine.exception.ProductNotFoundException;


@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value = ProductNotFoundException.class )
	public ResponseEntity<ApiError> getExceptioHandler() {
		
		ApiError error = new ApiError(400 , "Content not found" , new Date());
		return new ResponseEntity<ApiError>( error , HttpStatus.BAD_REQUEST);
	}

}
