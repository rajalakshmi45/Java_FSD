package com.example.spring;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("jdbcTemp")
public class JdbcTemp extends JdbcTemplate{
	BasicDataSource dSource;
	@PostConstruct
	public void init() {
		setDataSource(dSource);
	}
	
	public Connection getConnection() throws SQLException {
		return dSource.getConnection(dSource.getUsername(),dSource.getPassword()); 
	}
	
}
