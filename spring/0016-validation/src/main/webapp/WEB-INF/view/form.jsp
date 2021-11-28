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
    <style>
        .error{color: rebeccapurple}
    </style>
</head>
<body>
<h1>myApp form</h1>
<hr>
<form:form action="processForm" modelAttribute="student">
    firstName : <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br><br>
    lastName : <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    country :
    <form:select path="country">
        <%--    <form:option value="iran" label="iran"/>--%>
        <%--    <form:option value="turkey" label="turkey"/>--%>
        <form:options items="${student.countryOption}"/>
    </form:select>
    <br>
    Male: <form:radiobutton path="gender" value="male"/> <br>
    Female: <form:radiobutton path="gender" value="female"/> <br>
    <br>
    <br>
    Operating system : Linux<form:checkbox path="operatingSystem" value="Linux"/>
    <br>Mac<form:checkbox path="operatingSystem" value="Mac"/>
    <br> <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
