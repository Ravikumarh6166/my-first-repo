package com.fsg.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("nm");
		String email = req.getParameter("useremail");
		String password = req.getParameter("upw");

		if (password.equals("ravi1234") && email.equals("ravi6166raj@gmail.com")) {
			RequestDispatcher rd = req.getRequestDispatcher("welcompage");
			rd.forward(req, resp);
		} else {
			out.print("Sorry password or email_id not valid");
			RequestDispatcher rd = req.getRequestDispatcher("/Request.html");
			rd.include(req, resp);
		}
	}

}
