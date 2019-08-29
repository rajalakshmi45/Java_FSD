package com.example.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Dao.EmployeeImpl;
import com.example.model.Employee;

/**
 * Servlet implementation class DeleteEmployeeController
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public int uid;
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doProcess(request, response);
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doProcess(request, response);
		}
		
		protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			EmployeeImpl emp = new EmployeeImpl();
			uid=Integer.parseInt(request.getParameter("uid"));
			emp.deleteEmployee(uid);
			RequestDispatcher rd = request.getRequestDispatcher("viewEmployee");
			rd.forward(request, response);
			
	}

}
