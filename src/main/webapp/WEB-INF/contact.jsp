<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   



    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>home page</title>
	 
	</head>
<body>
<h1>New Contact</h1>
<form:form action="/student/contact" method="post">
    <p>
        <select name="student">
			<option selected="selected">Select student</option>
			<c:forEach items="${student}" var="student">
				<option value="${student.id}">${student.first} ${student.last}</option>
			</c:forEach>
		</select>
    </p>
     	<label for="address">Address</label>
		<input type="text" name="address">
		<label for="city">City</label>
		<input type="text" name="city">
   		<label for="state">State:</label>
		<input type="text" name="state">
		
    <input type="submit" value="Submit"/>
</form:form>   
</body>
</html> 