<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            max-width: 500px;
            margin: 50px auto;
            padding: 30px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
            color: blue;
        }
        

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            max-width: 100%;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="date"],
        textarea,
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<%
    int projectId = 0;
    String error = request.getParameter("error");

    // Retrieve project ID and handle potential parsing errors (assuming parsing happens elsewhere)
    try {
        projectId = Integer.parseInt(request.getParameter("projectId"));
    } catch (NumberFormatException e) {
        // Handle invalid project ID (redirect with error message?)
        error = "Invalid project ID";
    }
%>
<div class="container">
<h2>Update Project</h2>
<form action="updateproject" method="post">
    <input type="hidden" name="projectId" value="<%= projectId %>">
    <label for="name">Name:</label>
    <input type="text" name="name" id="name" required><br>
    <label for="description">Description:</label>
    <textarea name="description" id="description" required></textarea><br>
    <label for="startDate">Start Date:</label>
    <input type="date" name="startDate" id="startDate" required><br>
    <label for="endDate">End Date:</label>
    <input type="date" name="endDate" id="endDate" required><br>
    <label for="managerId">Manager ID:</label>
    <input type="number" name="managerId" id="managerId" required><br>
    <input type="submit" value="Update Project">
</form>
    </div>
</body>
</html>