package com.spring.SpringJDBC.passenger.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.SpringJDBC.passenger.dto.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setId(rs.getInt(1));
		passenger.setFirstName(rs.getString(2));
		passenger.setLastName(rs.getString(3));
		return passenger;
	}

	

}
