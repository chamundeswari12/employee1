package com.example.demo;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class customException  extends RuntimeException{
	

	public customException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
