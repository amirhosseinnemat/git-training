<%--
  Created by IntelliJ IDEA.
  User: amir
  Date: 11/25/21
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>myApp form</h1>
<hr>
<form:form action="processForm" modelAttribute="student">
    firstName : <form:input path="firstName"/>
    <br><br>
    lastName : <form:input path="lastName"/>
    <br><br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
