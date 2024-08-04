<%@page import="com.wp.mycart.helper.FactoryProvider"%>
<html>
<body>
<h2>Hello World!</h2>
<h1>Creating SessionFactory Object</h1>
<%
	out.println(FactoryProvider.getFactory());
%>
</body>
</html>