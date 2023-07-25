package com.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.entity.DataModel;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	Employee employee = new Employee();

	DataModel dataModel = new DataModel();

//	public List<Model> getModel (Employee emp, String msg, HttpStatus httpStatus){
//	
//		
//	}

//	@PersistenceContext
//	EntityManager entityManager;

	@Override
	public ResponseEntity<?> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> emp = employeeRepository.findAll();
		dataModel.setEmployee(emp);
		dataModel.setHttpStatus(HttpStatus.OK);
		dataModel.setMessage("Employee list");
		// return message;
		return new ResponseEntity<>(dataModel, HttpStatus.OK);

	}

	@Override
	public Employee saveEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
//	@Override
//	public Employee saveEmployee(Employee employee) {
//
//		
//		//try {
////			System.out.println(employee.geteSalary());
////			System.out.println(employee.geteFullName());
//			employee.seteFullName( employee.geteFullName());
//	    	employee.seteSalary(employee.geteSalary());
//	    	//employeeRepository.save(employee);
//			employee.seteCompanyName( employee.geteCompanyName());
//			employeeRepository.save(employee);
//		        //String message, HttpStatus httpStatus, Employee employee
//		        //dataModel = new DataModel("Employee created successfully",HttpStatus.CREATED ,employee);
//		        dataModel.setEmployee((List<Employee>) employee);
//		        dataModel.setHttpStatus(HttpStatus.OK);
//		        dataModel.setMessage("Employee created successfully");
//		        //return message;
//		        return new ResponseEntity<DataModel>(dataModel, HttpStatus.OK);
//	  
//		    } catch (Exception e) {
//			System.out.println(e);
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong credentials");
//			}

	@Override
	public Employee getEmployeeById(Integer eId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(eId).get();
	}

	@Override
	public Employee updateEmployee2(int id, String ename) {

		employee = employeeRepository.findById(id).get();
		employee.seteFullName(ename);
		return employeeRepository.save(employee);

	}

//
//	@Override
//	public Employee updateEmployee(Integer eId,Employee employee) {
//		  Employee existingEmployee = employeerepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id)); 
//				        
////				        existingEmployee.setFirstname(employee.getFirstname());
////				        existingEmployee.setLastname(employee.getLastname());
////				        existingEmployee.setEmail(employee.getEmail());
////				        // save existing employee to DB
////				        employeerepository.save(existingEmployee);
////				        return existingEmployee;
//		
//		
//		
//	}

	public void deleteEmployeeById(Integer eId) {

		employeeRepository.deleteById(eId);
	}

}
