<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact</title>
</head>
<body>

 <h2> All Contacts</h2>
	<table>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>Billing</th>
			
			
		</tr>
		<c:forEach var="contact" items="${contacts}"> <!-- ${contacts} it consist of object address,,, here contact variable holding first address then second obj address-->
	     <tr>
			<td><a href=""></a> ${contact.firstName}</td> <!-- if u want to print in spring then u have write variable ${contact.firstName} like this format -->
			<td>${contact.lastName}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td>${contact.source}</td>
			<td><a href="generateBill?id=${contact.id}">billing</a></td> <!-- when u click on billing then id get stored and call to generateBill url handler method-->
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>