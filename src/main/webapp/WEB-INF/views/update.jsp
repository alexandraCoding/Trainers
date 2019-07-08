<%-- 
    Document   : update
    Created on : 09-Jul-2019, 00:59:24
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>     


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Update</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
	<p><strong>Update Here | <a href="../read">Click for Read</a></strong></p>
<form action="../update" method="post">
<pre>
<c:forEach var="trainer" items="${listTrainer}">
		
Id:    	<input type="text" name="dispId" value="${trainer.id}" disabled="disabled"/>
		<input type="hidden" name="id" value="${trainer.id}"/>			
FName:  	<input type="text" name="fname" value="${trainer.fname}" />
		
LName: 	<input type="text" name="lname" value="${trainer.lname}" />
	    

        <input type="submit" value="Update" />	
</c:forEach>	
</pre>
</form>
${msg}
</body>
</html>