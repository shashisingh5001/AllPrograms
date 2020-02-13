package website;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sa")
public class Save extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
	  {
		  PrintWriter out=res.getWriter();
		  
		  String temp1=req.getParameter("email");
		  String temp2=req.getParameter("name");
		  String temp3=req.getParameter("pass"); 		 
		 
		 
		  System.out.println(temp1);	 
		  System.out.println(temp2);	 
		  System.out.println(temp3);	 
		 
		  
		  
		 /* req.setAttribute("k", k);
	 RequestDispatcher rd= req.getRequestDispatcher("sq");
			 
		  rd.forward(req, res);*/
	  }
}
