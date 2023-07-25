package com.employee.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.employee.entity.DataModel;
import com.employee.entity.Employee;

public interface EmployeeService {
	ResponseEntity<?> getAllEmployee();
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(Integer eId);
	//Employee updateEmployee(Employee employee,Integer eId);

	Employee updateEmployee2(int id,String ename);
	void deleteEmployeeById(Integer eId);

}
