package com.filterapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	PrintWriter out= resp.getWriter();
	String eid=req.getParameter("eid");
	String ename=req.getParameter("ename");
	int eage=Integer.parseInt(req.getParameter("eage"));
	String email=req.getParameter("email");
	String emobile=req.getParameter("email");
	
	out.print("<html>");
	out.print("<body>");
	out.print("<h1>Naukari Profile</h1>");
	out.print("<h2>Employee Details</h2>");
	out.print("<table border=1>");
	out.print("<tr><td>Employee Id</td><td>"+eid+"</td></tr>");
	out.print("<tr><td>Employee Id</td><td>"+ename+"</td></tr>");
	out.print("<tr><td>Employee Id</td><td>"+eage+"</td></tr>");
	out.print("<tr><td>Employee Id</td><td>"+email+"</td></tr>");
	out.print("<tr><td>Employee Id</td><td>"+emobile+"</td></tr>");
	out.print("</html></body>");
	}

}
