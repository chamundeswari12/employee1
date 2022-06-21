package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;


@Service

public class EmployeeService  implements EmployeeServiceImpl{
	
	@Autowired
    EmployeeRepo emprepo;	
	

	@Override
	public Employee addEmployee(Employee employee) {

		return emprepo.save(employee);
	}
	
	
	
	

}

