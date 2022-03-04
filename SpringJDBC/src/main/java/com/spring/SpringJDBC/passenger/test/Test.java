package com.spring.SpringJDBC.passenger.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringJDBC.passenger.dao.PassengerDAO;
import com.spring.SpringJDBC.passenger.dto.Passenger;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpringJDBC/passenger/test/config.xml");
		PassengerDAO dao = (PassengerDAO) context.getBean("dao");
		
		Passenger passenger = new Passenger();
		passenger.setId(5);
		passenger.setFirstName("James");
		passenger.setLastName("Rocket");
		
		//dao.create(passenger);
		//dao.update(passenger);
		//dao.delete(1);
		//dao.read(3);
		//dao.read();
	}

}
