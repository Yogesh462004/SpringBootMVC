<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Edit Doctor</title>
</head>
<body>

<h2 style="text-align:center; color:green;">Edit Doctor Details</h2>

<form action="updated" method="post" style="width:300px; margin:auto;">
    <table>
        <tr>
            <td>Doctor ID:</td>
            <td>
                <input type="text" name="did" value="${docid}" readonly />
            </td>
        </tr>
        <tr>
            <td>Name:</td>
            <td>
                <input type="text" name="dname"  required />
            </td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td>
                <input type="number" name="dsal"  required />
            </td>
        </tr>
        <tr>
            <td colspan="2" style="text-align:center;">
                <input type="submit" value="Update Doctor" />
            </td>
        </tr>
    </table>
</form>

</body>
</html>
