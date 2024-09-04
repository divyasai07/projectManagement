package com.manage.web;

import javax.servlet.RequestDispatcher;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.manage.bean.Project;
import com.manage.dao.ProjectDao;


/**
 * Servlet implementation class SetServlet
 */
@WebServlet("/SetServlet")
public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 List<Project> students = ProjectDao.selectAllUsers();
	        
	        // Set students attribute in request
	        request.setAttribute("projects", students);
	        
	        // Forward request to read.jsp
	        RequestDispatcher dispatcher = request.getRequestDispatcher("read.jsp");
	        dispatcher.forward(request, response);
	}

}
