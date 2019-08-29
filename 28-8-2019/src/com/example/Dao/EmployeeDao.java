package com.example.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	public void deleteEmployee(int uid);
	public ArrayList<Employee> editEmployee(int uid);
	public void updateEmployee(int uid,String name,String email,String password,String country) throws SQLException;
}
