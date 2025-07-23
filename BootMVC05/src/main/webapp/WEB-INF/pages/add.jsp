<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Doctor</title>
</head>
<body>
    <h2>Add Doctor</h2>
    <frm:form  modelAttribute="doctor">
        <table>
            <tr>
                <td>Namee:</td>
                <td><frm:input path="dname"/></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><frm:input path="dsal"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add"/></td>
            </tr>
        </table>
    </frm:form>
</body>
</html>
