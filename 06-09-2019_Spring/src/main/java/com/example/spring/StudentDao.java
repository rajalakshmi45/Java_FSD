package com.example.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("sDao")
public class StudentDao {
	
	@Autowired
	JdbcTemplate jdbcTemp;
	
	

	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}



	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}



	public void createStudent(Student student) {
	
		String query ="insert into student(fname,lname,country,favouriteLanguage,operatingSystems) values (?,?,?,?.?)";
		Object obj[]= {student.getfName(),student.getlName(),student.getCountry(),student.getFavoriteLanguage(),student.getOperatingSystems()};
		jdbcTemp.update(query, obj);
		System.out.println("done");
}

}
