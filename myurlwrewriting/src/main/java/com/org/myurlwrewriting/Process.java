package com.org.myurlwrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Process extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	String lpname=req.getParameter("lpname");
	String price=req.getParameter("price");
	PrintWriter out=resp.getWriter();
	out.print("<h1>Hi welcome Laptop Center<h1>");
	out.print("<a href='servlet2 '>Clickhere");
	}

}
