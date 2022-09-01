package com.fsg.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class Welcome extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		/*
		 * RequestDispatcher rd = req.getRequestDispatcher("/Request.html");
		 * rd.include(req, resp);
		 */
		
		String name1 = req.getParameter("name");

		out.print("welcome " + name1);
	}

}
