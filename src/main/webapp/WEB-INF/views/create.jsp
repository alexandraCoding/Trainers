<%-- 
    Document   : create
    Created on : 09-Jul-2019, 00:52:08
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
<html>
<head>
<title>Create</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>	
<form action="create" method="post">
<pre>
    <strong>Create Here | <a href="./read">Click for Read</a></strong>
		
	FName: <input type="text" name="fname" />
	
	LName: <input type="text" name="lname" />
	
	

	<input type="submit" value="Create" />
</pre>
</form>
${msg}
</body>
</html>
