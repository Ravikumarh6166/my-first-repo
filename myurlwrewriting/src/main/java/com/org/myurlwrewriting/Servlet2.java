package com.org.myurlwrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String str1 =req.getParameter("lpname");
		String str2 =req.getParameter("price");
		PrintWriter out=resp.getWriter();
		out.print("<h1>Name= "+str1+" Price= "+str2+"</h1>");
	}

}
