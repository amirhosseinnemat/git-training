<%--
  Created by IntelliJ IDEA.
  User: amir
  Date: 11/25/21
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${student.firstName} - ${student.lastName} - ${student.country} - ${student.gender}</h2>
<hr>
<ul>
    <c:forEach var="temp" items="${student.operatingSystem}">
        <li>${temp}</li>
    </c:forEach>
</ul>
<hr>
<a href="/">Click here to go home page</a>

</body>
</html>
