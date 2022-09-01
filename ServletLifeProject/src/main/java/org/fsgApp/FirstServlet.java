package org.fsgApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	public FirstServlet() {
		System.out.println("Jee container creates servlet object");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servlet object intialised by calling init()");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException {
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		PrintWriter out = resp.getWriter();
		out.print("<html><body bgcolor='yellow'><h1>The Employee " + name + " from " + place + "</h1></body></html>");
		System.out.println("service() called by JEE container");
		out.flush();
	}

	@Override
	public void destroy() {
		System.out.println("destroyed () is called");
	}

}
