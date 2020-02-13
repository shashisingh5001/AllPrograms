<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>

<%!
    Connection con=null;
    PreparedStatement pst=null;    
%>   
<%
   try{
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	   
      }
      catch( Exception e)
      {
    	  e.printStackTrace();
	  }
%>
<%
  String user=request.getParameter("uname");
  String pass=request.getParameter("pass");
 
  try{
	  pst=con.prepareStatement("insert into user values(?,?)");
	  pst.setString(1,user);
	  pst.setString(2,pass);
	  pst.executeUpdate();
	  out.println("Record inserted sucufully");
     }
  catch(Exception e)
  {
	  e.printStackTrace();
  }
%>
    
</body>
</html>