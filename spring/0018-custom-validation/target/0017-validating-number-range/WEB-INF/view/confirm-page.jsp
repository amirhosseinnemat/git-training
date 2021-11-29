<%--
  Created by IntelliJ IDEA.
  User: amir
  Date: 11/29/21
  Time: 02:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirm Page</title>
</head>
<body>
<header>
    <h1>Student Detail</h1>
</header>

<hr>

<ul>
    <li>${student.firstName}</li>
    <li>${student.lastName}</li>
    <li>freePasses : ${student.freePasses}</li>
    <li>postal code : ${student.postalCode}</li>
</ul>
</body>
</html>
