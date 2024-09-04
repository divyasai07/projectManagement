<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Project</title>
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
        text-align: center;
    }

    h2 {
        margin-bottom: 20px;
        color: #dc3545;
    }

    .form-box {
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
        max-width: 100%;
    }

    label {
        display: block;
        margin-bottom: 10px;
        font-weight: bold;
    }

    input[type="text"] {
        width: calc(100% - 20px); /* Adjusting for padding */
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    button[type="submit"] {
        background-color: #dc3545;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
        width: 100%;
    }

    button[type="submit"]:hover {
        background-color: #c82333;
    }
</style>
</head>
<body>
<div class="container">
    <h2>Delete Project</h2>
    <div class="form-box">
        <form action="deleteproject" method="post">
            <label for="projectId">Project ID:</label>
            <input type="text" id="projectId" name="projectId" required>
            <button type="submit">Delete</button>
        </form>
    </div>
</div>
</body>
</html>
