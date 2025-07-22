package com.example.user.service.UserService.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.user.service.UserService.payload.ApiResponse;

/*@RestControllerAdvice*/
public class GlobalExceptionHandler{
	
	
	/*This is for @controllerAdvice 
	 * 
	 * @ResponseStatus(value=HttpStatus.BAD_GATEWAY)
	 * 
	 * @ExceptionHandler({NullPointerException.class}) public String
	 * getExceptionHandleMessage() { return "hello exception";
	 * 
	 * }
	 */
	//This below for @RestControlllerAdvice
	//in this APIResponse is payload class
	/*
	 * @ExceptionHandler(Exception.class) public ResponseEntity<ApiResponse>
	 * getExceptionHandlerMessage(NullPointerException err, @RequestBody ApiResponse
	 * apiresponse) { String message=err.getMessage(); ApiResponse payload = new
	 * ApiResponse.Builder() .status(HttpStatus.ACCEPTED) .message(message)
	 * .data("Here is your data") .build();
	 * 
	 * return new ResponseEntity<ApiResponse>(payload,HttpStatus.ACCEPTED);
	 * 
	 * 
	 * 
	 * }
	 */
}

	
	
		
		
	


