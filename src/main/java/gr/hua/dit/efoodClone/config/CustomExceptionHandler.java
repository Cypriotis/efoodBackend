package gr.hua.dit.efoodClone.config;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomErrorResponse> handleException(Exception ex){
		CustomErrorResponse errorResponse = new CustomErrorResponse();
		errorResponse.setMessage("An error occured: Hidden Response");
		return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
}
