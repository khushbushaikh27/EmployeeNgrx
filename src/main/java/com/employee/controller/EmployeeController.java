package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.TypeMismatchDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.employee.entity.DataModel;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/empSystem")
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

//	public EmployeeController(EmployeeService employeeService) {
//		super();
//		this.employeeService = employeeService;
//	}

//	@GetMapping("employee/createEmployee")
//	public String createEmployee(Model model) {
//		Employee employee = new Employee();
//		model.addAttribute("employee", employee);
//		return "create";
//		
//	}

//	@PostMapping()
//	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
//	try {
//		//employeeService.saveEmployee(employee);
//				return new ResponseEntity<?,?,?>(employeeService.saveEmployee(employee), "Employee created" , HttpStatus.CREATED);
//				//return new ResponseEntity<String>("Employee successfully created!!", HttpStatus.CREATED);
//				//return new Resp
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//	}
//		
//	}
	//@Autowired
	DataModel dataModel = new DataModel();
	
//
//	 @PostMapping("/n")
//	 public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
//		 return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
//	    }

	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.OK);
	}
		
	
//	@PostMapping("/abcd")
//	public ResponseEntity<?>saveEmp(@RequestBody Employee employee) throws HttpMessageNotReadableException
//	{
//		System.out.println("dddd");
//		return employeeService.saveEmployee(employee);
//	}
		
	    

	@GetMapping("/getAll")
	public ResponseEntity<?> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer employeeID) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeID), HttpStatus.OK);

	}

//	@PutMapping("/empSystem/update/{id}")
//	 public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer eid, @RequestBody Employee employee){
//
//		//return new ResponseEntity<Employee>(employeeService.updateEmployee(eid, employee), HttpStatus.OK);
//		return new employeeService.updateEmployee((eid, employee), HttpStatus.OK);
//		
//	        }
//	



	@PutMapping("/updateEmp2")
	 public Employee updateEmployee2(@RequestParam int id,@RequestParam String ename){
		return employeeService.updateEmployee2(id,ename);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable("id") Integer eid){
		employeeService.deleteEmployeeById(eid);
		return new ResponseEntity<String>("Employee deleted successfully!!", HttpStatus.OK);
	}

	
}
