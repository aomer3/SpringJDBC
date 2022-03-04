package com.spring.SpringJDBC.employee.dao;

import java.util.List;

import com.spring.SpringJDBC.employee.dto.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();
	

}
