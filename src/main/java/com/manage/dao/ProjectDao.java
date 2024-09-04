package com.manage.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manage.bean.Project;


public class ProjectDao {

	private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final static String DB_URL = "jdbc:mysql://localhost/projectdb";
    private final static String USER = "root";
    private final static String PASS = "Divya@2004";
    
private static final String SELECT_ALL_USERS = "select * from Project";
private static final String INSERT_PROJECT_SQL = "INSERT INTO Project" + "  (project_id,name,description,start_date,end_date,manager_id) VALUES"+"(?,?,?,?,?,?);";


    
    protected static Connection getConnection() {
		Connection conn = null;
    
    		try {
    	        Class.forName(JDBC_DRIVER);
	            conn = DriverManager.getConnection(DB_URL, USER, PASS);
    		}
    		catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (ClassNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return conn;
    }
    public static List<Project> selectAllUsers(){
  	  
		List<Project> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (resultSet.next()) {
				
				Project project = new Project();
				project.setProjectId(resultSet.getInt("project_id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setStartDate(resultSet.getString("start_date"));
                project.setEndDate(resultSet.getString("end_date"));
                project.setManagerId(resultSet.getInt("manager_id"));
				
                   users.add(project); 
			}
		} catch (SQLException e) {
			 e.printStackTrace();
		}
		return users;
	}

 
    public static void addProject(Project project) throws SQLException {

        // try-with-resource statement will auto close the connection.
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(INSERT_PROJECT_SQL)) {

            stmt.setInt(1, project.getProjectId());
            stmt.setString(2, project.getName());
            stmt.setString(3, project.getDescription());
            stmt.setString(4, project.getStartDate());
            stmt.setString(5, project.getEndDate());
            stmt.setInt(6, project.getManagerId());
            System.out.println(stmt);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    String UPDATE_PROJECT_SQL = "UPDATE Project SET name=?, description=?, start_date=?, end_date=?, manager_id=? WHERE project_id=?";

    public void updateProject(Project project) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(UPDATE_PROJECT_SQL)) {

            stmt.setString(1, project.getName());
            stmt.setString(2, project.getDescription());
            stmt.setString(3, project.getStartDate());
            stmt.setString(4, project.getEndDate());
            stmt.setInt(5, project.getManagerId());
            stmt.setInt(6, project.getProjectId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteProject(int projectId) throws SQLException {
        String DELETE_PROJECT_SQL = "DELETE FROM Project WHERE project_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(DELETE_PROJECT_SQL)) {
            stmt.setInt(1, projectId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }



}
