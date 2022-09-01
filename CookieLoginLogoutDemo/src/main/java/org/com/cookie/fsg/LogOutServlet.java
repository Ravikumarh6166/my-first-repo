package org.com.cookie.fsg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogOutServlet extends HttpServlet {
	public void doget(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException,IOException {
		PrintWriter out=resp.getWriter();
		req.getRequestDispatcher("link.html").include(req, resp);
		Cookie ck= new Cookie("name", "");
		ck.setMaxAge(0);
		resp.addCookie(ck);
		out.print("Logout Successful");
}
}
