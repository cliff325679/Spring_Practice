package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public void save(Employee theEmployee);
	
	public Employee findById(int theId);
	
	public void deleteById(int theId);
}
