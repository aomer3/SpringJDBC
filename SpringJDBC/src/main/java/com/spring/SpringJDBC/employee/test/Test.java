package com.spring.SpringJDBC.employee.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringJDBC.employee.dao.EmployeeDAO;
import com.spring.SpringJDBC.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpringJDBC/employee/test/config.xml");
		EmployeeDAO dao = (EmployeeDAO) context.getBean("dao");
		context.close();
		
		//Insert, update and delete from database
		Employee employee = new Employee();
		employee.setId(5);
		employee.setFirstName("Oprah");
		employee.setLastName("Winfrey");
		
		//int result = dao.create(employee);
		//int result = dao.update(employee);
		//int result = dao.delete(2);
		
		//Select one record from the database by id number
		//Employee emp = dao.read(2);
		
		//Selecting all records from the database
		List<Employee> emps = dao.read();
		
		System.out.println("Employee record: " + emps);
	}

}
