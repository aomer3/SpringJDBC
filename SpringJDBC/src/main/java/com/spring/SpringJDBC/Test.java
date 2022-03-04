package com.spring.SpringJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpringJDBC/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		context.close();
		
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, 1,"Bill","Clinton");
		
		System.out.println(result + " records has been inserted.");
	}

}
