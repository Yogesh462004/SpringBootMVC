<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Doctor Report</title>
</head>
<body>
    <c:if test="${not empty result}">
    <h3 style="color:green; text-align:center;">${result}</h3>
</c:if>
<c:choose>
    <c:when test="${!empty doctList}">
        <h1 style="color:red; text-align:center">Doctors Report</h1>
        <table border="1" align="center" bgcolor="cyan">
            <tr style="color: red">
                <th>Doctor ID</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Operations</th>
            </tr>
            <c:forEach var="doc" items="${doctList}">
                <tr style="color: blue">
                    <td>${doc.did}</td>
                    <td>${doc.dname}</td>
                    <td>${doc.dsal}</td>
                    <td>
                        <form action="doc_edit" method="get" style="display:inline;">
                            <input type="hidden" name="no" value="${doc.did}" />
                            <input type="submit" value="Edit" />
                        </form>
                        <form action="doc_delete" method="get" style="display:inline;">
                            <input type="hidden" name="no" value="${doc.did}" />
                            <input type="submit" value="Delete" />
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:when>

    <c:otherwise>
        <h1 style="color:red; text-align:center">Doctors Not Found</h1>
    </c:otherwise>
</c:choose>

<br>
<center>
    <form action="doc_add" method="get" style="display:inline;">
        <input type="submit" value="Add Doctor" />
    </form>
    &nbsp;&nbsp;&nbsp;
    <form action="./" method="get" style="display:inline;">
        <input type="submit" value="Home" />
    </form>
</center>

</body>
</html>
