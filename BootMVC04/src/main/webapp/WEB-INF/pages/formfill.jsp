<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Register</title>
</head>
<body>
<h2 style="color:blue;">Welcome to report</h2>

<form action="register" method="post">
    <label for="sname">Name:</label>
    <input type="text" id="sname" name="sname">
    <br><br>

    <label for="sage">Age:</label>
    <input type="text" id="sage" name="sage">
    <br><br>

    <input type="submit" value="register">
</form>
</body>
</html>
