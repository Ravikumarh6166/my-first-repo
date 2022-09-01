package com.fsg.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SimpleServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException {
		
		String str1=req.getParameter("n1");
		String str2=req.getParameter("n2");
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		int num3=num1+num2;
		PrintWriter out=resp.getWriter();
		out.print("Addition of Two numbers is "+num3);
		out.close();
	}

}
