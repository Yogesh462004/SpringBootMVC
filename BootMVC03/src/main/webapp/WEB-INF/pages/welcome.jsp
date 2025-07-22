<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

    <h2>Season Name: ${result}</h2>
    <a href="/">Back To Home</a>
    <c:forEach var="c" items="${fav}">
    ${c}<br>
    </c:forEach>
    <hr>
    <c:choose>
    <c:when test="${!empty emps}">
    <table border="1" bgcolor="cyan" align="center">
    <tr>
    <th>Name</th><th>Salary</th>
    </tr>
    <c:forEach var="emp" items="${emps}">
    <tr>
    <td>${emp.name}</td>
    <td>${emp.sal}</td>
    
    </tr>
    </c:forEach>
    </table>
    </c:when>
    <c:otherwise>NOt Found</c:otherwise>
    </c:choose>
    
    
</body>
</html>
