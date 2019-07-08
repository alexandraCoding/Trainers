<%-- 
    Document   : read
    Created on : 09-Jul-2019, 00:55:05
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

       

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Read</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
	<p><strong>Student List is Here | <a href="create.jsp">Click for Create</a></strong></p>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>FName</th>
			<th>LName</th>
			<th>Action</th>
		</tr>
		<c:forEach var="trainer" items="${listTrainer}">
			<tr>
				<td>${trainer.id}</td>
				<td>${trainer.fname}</td>
				<td>${trainer.lname}</td>
				
				<td><a href="update/<c:out value='${student.id}'/>">Update</a> | <a
					href="delete/<c:out value='${student.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
