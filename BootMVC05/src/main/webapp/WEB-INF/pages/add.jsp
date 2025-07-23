<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Doctor</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <style>
        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>
</head>
<body>
    <h2>Add Doctor</h2>
    <frm:form modelAttribute="doctor" method="post" action="/doc_add">
        <table>
            <tr>
                <td>Name:</td>
                <td>
                    <frm:input path="dname"/>
                    <br/>
                    <frm:errors path="dname" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td>
                    <frm:input path="dsal"/>
                    <br/>
                    <frm:errors path="dsal" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add"/></td>
            </tr>
        </table>
    </frm:form>
</body>
</html>
