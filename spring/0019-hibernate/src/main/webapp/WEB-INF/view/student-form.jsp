<%--
  Created by IntelliJ IDEA.
  User: amir
  Date: 11/29/21
  Time: 02:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student-form</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<header>
    <h1>Student Form</h1>
</header>
<hr>
<form:form action="processForm" modelAttribute="student">

    firstName : <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br><br>
    lastName : <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    fressPasses : <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br><br>
    postalCode : <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br><br>


    <input type="submit" value="Submit">

</form:form>
</body>
</html>
