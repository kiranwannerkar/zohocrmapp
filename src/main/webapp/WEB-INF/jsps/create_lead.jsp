<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
	<h2>Create new Lead</h2>
	<form action="save" method="post">
			<pre> <!-- this tag will reaponsible for feild in different line -->
			 First Name: <input type="text" name="firstName">
			 Last Name: <input type="text" name="lastName">
			 Email: <input type="text" name="email">
			 Mobile: <input type="text" name="mobile">
			 Source: 
			 <select name="source">
			  <option value="radio">radio</option> <!--radio this value store into source  -->
			  <option value="news paper">news Paper</option>
			  <option value="trade show">trade show</option>
			  <option value="website">website</option>
		     </select>
             <input type="submit" value="save">
			</pre>
	</form>
</body>
</html>