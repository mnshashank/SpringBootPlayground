package com.shashank.mn.SpringBootPlayground;

public class EmployeeNotFoundException extends RuntimeException{

	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
