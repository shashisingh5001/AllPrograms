package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String s1=request.getParameter("name");
		String s2=request.getParameter("pass");
		
		if(s1.equals("Shashi")&&s2.equals("shashi"))
		{
			HttpSession session=request.getSession();	
			session.setAttribute("username",s1);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}

	
}
