 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   


    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>home page</title>
	 
	</head>
<body>
		<h1>All Students</h1>
	<table>
	    <thead>
	        <tr>
	            <th>First Name</th>
	            <th>Last Name</th>
	            <th>Age</th>
	            <th>Address</th>
	            <th>city</th>
	            <th>State</th>
	        </tr>
	    </thead>
	    
	    <tbody>
	        <c:forEach items="${student}" var="student">
	        <tr>
	            <td><c:out value="${student.first}"/></td>
	            <td><c:out value="${student.last}"/></td>
	            <td><c:out value="${student.age}"/></td>
	            <td><c:out value="${student.contact.address}"/></td>
	            <td><c:out value="${student.contact.city}"/></td>
	            <td><c:out value="${student.contact.state}"/></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
	<a href="/student/new">New student</a>
	<a href="/student/contact">Add Contact</a>
</body>