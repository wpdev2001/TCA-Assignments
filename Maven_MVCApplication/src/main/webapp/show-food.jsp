<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Food Menu</title>
</head>
<body>
	<h1 align="center">Menu</h1>
	<table border="1" cellpadding="30%" align="center" bordercolor="red">

		<tr>
			<th>Code</th>
			<th>Item</th>
			<th>Price</th>
		</tr>

		<c:forEach var="items" items="${foodItems}">
			<tr>
				<td>${items.id}</td>
				<!-- This is going to call getId() method of Food.java -->
				<td>${items.item}</td>
				<!-- This is going to call getItem() method of Food.java -->
				<td>${items.price}</td>
				<!-- This is going to call getId() method of Food.java -->
			</tr>
		</c:forEach>

	</table>
</body>
</html>