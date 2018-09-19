<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>home page</title>
	 
	</head>
<body>
<h1>New Student</h1>
<form:form action="/student/new" method="post" modelAttribute="student">
    <p>
        <form:label path="first">First Name</form:label>
        <form:errors path="first"/>
        <form:input path="first"/>
    </p>
    <p>
        <form:label path="last">Last Name</form:label>
        <form:errors path="last"/>
        <form:textarea path="last"/>
    </p>
     <p>
        <form:label path="age">Age</form:label>
        <form:errors path="age"/>
        <form:textarea path="age"/>
    </p>
    
    <input type="submit" value="Submit"/>
</form:form>   
</body>
</html> 