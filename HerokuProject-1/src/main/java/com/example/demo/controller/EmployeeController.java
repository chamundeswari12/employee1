package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customException;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	@Autowired
   EmployeeRepo repos;
	
	@PostMapping("/AddingEmployee")
	public ResponseEntity<?>  AddingEmployee(@RequestBody Employee employee)
	{
		
		 Employee e=empservice.addEmployee(employee);
		
		 return new ResponseEntity<Employee>(e,HttpStatus.OK);
		
	}

	@GetMapping("/findall")
	public List<Employee> gettingAllEmployee()
	{
		List<Employee> i=repos.findAll();
		return i;
	}
	
	@GetMapping("/gg/{id}")
	public  Employee getBased(@PathVariable int id)
	{
		Employee e=repos.findById(id).orElseThrow(()->new customException("employee not exist with id"+id));
		return e;
	}
	
}

