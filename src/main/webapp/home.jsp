<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    /* Custom CSS */
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
    }

    .container {
        margin-top: 50px;
    }

    .nav-item a {
        text-decoration: none;
        color: #333;
        font-weight: bold;
        font-size: 18px;
        padding: 10px 20px;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }

    .nav-item a:hover {
        background-color: #007bff;
        color: #fff;
    }
</style>
</head>
<body>
   <div class="container">
        <ul class="nav nav-pills">
            <li class="nav-item">
                <a class="nav-link" href="create.jsp">Create Project</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="SetServlet">Read Project</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="updateproject.jsp">Update Project</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="delete.jsp">Delete Project</a>
            </li>
        </ul>
    </div>
</body>
</html>