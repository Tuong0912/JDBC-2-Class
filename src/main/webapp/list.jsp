<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09/03/2023
  Time: 03:11 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>NameUser</td>
        <td>NameProvince</td>
    </tr>
    <c:forEach var="u" items="${users}">
        <tr>
            <td>${u.id}</td>
            <td>${u.name}</td>
            <td>${u.province().nameP}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
