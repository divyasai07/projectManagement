package com.manage.web;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/LoginprojectServlet")
public class LoginprojectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginprojectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rollNumber = request.getParameter("rollNumber");
        String password = request.getParameter("password");

        if (rollNumber.equals(password)) { // Assuming username and password are the same
            HttpSession session = request.getSession();
            session.setAttribute("rollNumber", rollNumber);
            response.sendRedirect("home.jsp");
        } else {
            response.sendRedirect("login.html");
        }
	}


}
