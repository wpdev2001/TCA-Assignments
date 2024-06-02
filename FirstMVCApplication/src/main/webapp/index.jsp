<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.wp.foodcart.Food" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MENU</title>
</head>
<body>

<%
    // Get the list of food items from the request attribute
    List<Food> foodItems = (List<Food>) request.getAttribute("foodItems");

    // Check if foodItems is not null and not empty
    if (foodItems != null && !foodItems.isEmpty()) {
        // Iterate over the list and display the items
        for (Food item : foodItems) {
%>
            <p>ID: <%= item.getId() %></p>
            <p>Item: <%= item.getItem() %></p>
            <p>Price: <%= item.getPrice() %></p>
            <hr>
<%
        }
    } else {
%>
        <p>Food items coming soon</p>
<%
    }
%>

</body>
</html>
