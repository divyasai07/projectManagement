package com.manage.web;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.manage.bean.Project;
import com.manage.dao.ProjectDao;

/**
 * Servlet implementation class CreateProjectServlet
 */
@WebServlet("/CreateProjectServlet")
public class CreateProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateProjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int projectId = Integer.parseInt(request.getParameter("projectId"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		int managerId = Integer.parseInt(request.getParameter("managerId"));

		Project project = new Project();
		project.setProjectId(projectId);
		project.setName(name);
		project.setDescription(description);
		project.setStartDate(startDate);
		project.setEndDate(endDate);
		project.setManagerId(managerId);

		try {
		    ProjectDao.addProject(project);
		    response.sendRedirect("read.jsp");
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}

	
}
