<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phong
  Date: 04/08/2025
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>Hello</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <c:forEach items="${}" var="">
            <tr>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
