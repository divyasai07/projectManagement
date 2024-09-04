package com.manage.web;

import javax.servlet.ServletException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.manage.dao.ProjectDao;


/**
 * Servlet implementation class DeleteprojectServlet
 */
@WebServlet("/deleteproject")
public class DeleteprojectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteprojectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private ProjectDao s;

    public void init() {
         s= new ProjectDao();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			int projectId = Integer.parseInt(request.getParameter("projectId"));
		    try {
		        s.deleteProject(projectId);
		        response.sendRedirect("read.jsp"); // Redirect to home page after deletion
		    } catch (SQLException e) {
		        throw new ServletException("Error deleting project", e);
		    }
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
		
		

}
