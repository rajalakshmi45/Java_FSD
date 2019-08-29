package com.example.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Dao.EmployeeImpl;
import com.example.model.Employee;

import comm.example.factory.MyConnectionFactory;

/**
 * Servlet implementation class AddEmployeeDb
 */
@WebServlet("/AddEmployeeDb.db")
public class AddEmployeeDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String email;
	private String password;
	private String country;
       
    
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				doProcess(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				doProcess(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
			name = request.getParameter("name");
			email = request.getParameter("email");
			password  = request.getParameter("password");
			country = request.getParameter("country");
			
			EmployeeImpl emp = new EmployeeImpl();
			emp.addEmployee(new Employee(name,email,password,country));
			
			
			
		}
			
}


