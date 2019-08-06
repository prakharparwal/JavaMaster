package com.prakhar.parwal.exception_handlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.prakhar.parwal.error_response.ErrorResponse;

@ControllerAdvice
public class MasterExceptionHandler {

	
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleNullPointerException(NullPointerException npe) {
		
		ModelAndView mv = new ModelAndView("null-pointer-exception");
		System.out.println("Null pointer excpetion has encountered. Handled using exception handler");
		return mv;
	}
	
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorResponse> handleNullPointerException(NullPointerException npe, WebRequest request) {
		
		String exceptionMessage = npe.getLocalizedMessage();
		List<String> details = new ArrayList<String>();
		details.add(exceptionMessage);
		
		ErrorResponse errorResponse = new ErrorResponse(ApplicationConstants., details)
		
	}
}
