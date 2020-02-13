package website;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class configure extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
	  {
		  PrintWriter out=res.getWriter();
		  	 
			  
		  String i=req.getParameter("u");
		  String j=req.getParameter("p");
		 
		  if(i.equals("Shashi")& j.equals("Shashi"))
		  {
			String URL="file:///C:/Users/Shashi%20Shankar%20Singh/Desktop/Quiz%20project/New%20folder/Form%20(1).html";
		    java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));	 
		    	 
		    	 
		  }
		  else {
			  out.println("Try Again");
			  
		  }
		  
		  
		 /* req.setAttribute("k", k);
	 RequestDispatcher rd= req.getRequestDispatcher("sq");
			 
		  rd.forward(req, res);*/
	  }
}
