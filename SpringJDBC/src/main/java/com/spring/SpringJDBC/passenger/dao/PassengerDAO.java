package com.spring.SpringJDBC.passenger.dao;

import java.util.List;

import com.spring.SpringJDBC.passenger.dto.Passenger;

public interface PassengerDAO {
	
	int create(Passenger passenger);
	
	int update(Passenger passenger);
	
	int delete(int id);
	
	Passenger read(int id);
	
	List<Passenger> read();
	
	

}
