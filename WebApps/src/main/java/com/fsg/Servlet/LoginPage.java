package com.fsg.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginPage extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String email=req.getParameter("email");
		String phone =req.getParameter("ph");
		PrintWriter out=resp.getWriter();
		out.print("name="+name+" dob= "+dob+" email= "+email+" phone= "+phone);
	}

}
