package com.employee.entity;

import java.util.List;

import org.springframework.http.HttpStatus;

public class DataModel {
	private String message;
	private HttpStatus httpStatus;
	private List<Employee> employee;
	
	
	public DataModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@SuppressWarnings("unchecked")
	public DataModel(String message, HttpStatus httpStatus, Employee employee) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		this.employee = (List<Employee>) employee;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
