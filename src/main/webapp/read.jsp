<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
<%@ page import="com.manage.bean.Project" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    padding: 20px;
  }

  h2 {
    text-align: center;
    margin-bottom: 20px;
    color:blue;
  }

  table {
    width: 100%;
    border-collapse: collapse;
    border: 1px solid #ddd;
  }

  th, td {
    padding: 8px;
    border: 1px solid #ddd;
    text-align: left;
  }

  th {
    background-color: #f2f2f2;
    color: #333;
  }

  tr:nth-child(even) {
    background-color: #f9f9f9;
  }

  .btn {
    padding: 8px 16px;
    border: none;
    cursor: pointer;
    border-radius: 4px;
    text-decoration: none;
  }

  .btn-primary {
    background-color: #007bff;
    color: #fff;
  }

  .btn-primary:hover {
    background-color: #0056b3;
  }

  .btn-danger {
    background-color: #dc3545;
    color: #fff;
  }

  .btn-danger:hover {
    background-color: #c82333;
  }
</style>
</head>
<body>
 <h2>All Projects</h2>
  <table>
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Manager ID</th>
        <th>Action</th> <!-- New column for the action -->
      </tr>
    </thead>
    <tbody>
      <% 
        List<Project> projects = (List<Project>) request.getAttribute("projects");
        if (projects != null) {
          for (Project project : projects) {
      %>
      <tr>
        <td><%= project.getProjectId() %></td>
        <td><%= project.getName() %></td>
        <td><%= project.getDescription() %></td>
        <td><%= project.getStartDate() %></td>
        <td><%= project.getEndDate() %></td>
        <td><%= project.getManagerId() %></td>
        <td>
         
             <form action="updateproject.jsp" method="post">
            <input type="hidden" name="projectId" value="<%= project.getProjectId() %>">
            <button type="submit" class="btn btn-primary">Edit</button>
          </form>
          <form action="delete.jsp" method="post">
            <input type="hidden" name="projectId" value="<%= project.getProjectId() %>">
            <button type="submit" class="btn btn-danger">Delete</button>
          </form>
         
        </td>
      </tr>
      <% 
          }
        }
      %>
    </tbody>
  </table>
</body>
</html>