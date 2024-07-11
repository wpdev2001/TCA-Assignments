<%@page import="com.wp.mycart.helper.FactoryProvider"%>
<html>
<head>
<title>MyCart Home</title>
<%@include file="components/common_css_js.jsp" %>
</head>

<body>
<%@include file="components/navbar.jsp" %>
<h2>Hello World!</h2>
<h1>Creating SessionFactory Object</h1>
<%
	out.println(FactoryProvider.getFactory());
%>
</body>
</html>