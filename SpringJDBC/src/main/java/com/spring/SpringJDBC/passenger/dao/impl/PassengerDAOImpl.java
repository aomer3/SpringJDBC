package com.spring.SpringJDBC.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.SpringJDBC.passenger.dao.PassengerDAO;
import com.spring.SpringJDBC.passenger.dao.rowmapper.PassengerRowMapper;
import com.spring.SpringJDBC.passenger.dto.Passenger;

@Component("dao")
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Passenger passenger) {
		String sql = "insert into passenger values(?,?,?)";
		int result = jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
		System.out.println(result + " records have been inserted.");
		return result;
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "update passenger set firstName=?, lastName=? where id=?";
		int result = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
		System.out.println(result + " records have been updated.");
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from passenger where id=?";
		int result = jdbcTemplate.update(sql, id);
		System.out.println(result + " records have been deleted.");
		return result;
	}

	@Override
	public Passenger read(int id) {
		String sql = "select * from passenger where id=?";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		Passenger passenger = jdbcTemplate.queryForObject(sql, rowMapper, id);
		System.out.println(passenger);
		return passenger;
	}

	@Override
	public List<Passenger> read() {
		String sql = "select * from passenger";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		List<Passenger> passengers = jdbcTemplate.query(sql, rowMapper);
		System.out.println(passengers);
		return passengers;
	}

}
