<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="t" class="packageTest.Test"></jsp:useBean>
<%
    t.setX(10);
    out.print(t.getX());
%>

</body>
</html>