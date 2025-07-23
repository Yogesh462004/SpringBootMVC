<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Countries List</title>
</head>
<body>
    <h2>Available Countries</h2>
    <ul>
        <c:forEach var="country" items="${cList}">
            <li>${country}</li>
        </c:forEach>
    </ul>
</body>
</html>
