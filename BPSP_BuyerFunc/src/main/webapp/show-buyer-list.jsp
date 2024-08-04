<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buyers List</title>
<style>
  /* Add your CSS styles here */
  table {
    border-collapse: collapse;
    width: 80%;
    margin: auto;
  }
  th, td {
    border: 1px solid black;
    padding: 8px;
    text-align: left;
  }
  th {
    background-color: #f2f2f2;
  }
</style>
</head>
<body>
    <h1 align="center">List of Buyers who applied for Invoice Amount</h1>
    <table id="buyerTable">
        <thead>
            <tr>
                <th>Buyer ID</th>
                <th>Buyer Name</th>
                <th>Requested Amount</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="buyer" items="${buyerList}">
                <tr>
                    <td>${buyer.buyer_id}</td>
                    <td>${buyer.buyer_name}</td>
                    <td>${buyer.buyer_request_amount}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <script>
        // Add interactivity here
        document.addEventListener("DOMContentLoaded", function() {
            var table = document.getElementById("buyerTable");
            var rows = table.getElementsByTagName("tr");
            
            // Add hover effect
            for (var i = 0; i < rows.length; i++) {
                rows[i].addEventListener("mouseover", function() {
                    this.style.backgroundColor = "#f0f0f0";
                });
                rows[i].addEventListener("mouseout", function() {
                    this.style.backgroundColor = "";
                });
            }
        });
    </script>
</body>
</html>
