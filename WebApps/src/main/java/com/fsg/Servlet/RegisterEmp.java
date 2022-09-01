package com.fsg.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegisterEmp extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException {
		
		int S_id=Integer.parseInt(req.getParameter("id"));
		String firstname=req.getParameter("fn");
		String lastname=req.getParameter("ln");
		String city=req.getParameter("city");
		int salary=Integer.parseInt(req.getParameter("sal"));
		PrintWriter out=resp.getWriter();
		try {
		Class.forName("org.postgresql.Driver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ravidatabase",
		            "postgres", "postgres");
	PreparedStatement ps=
			con.prepareStatement("insert into studentregistration values(?,?,?,?,?)");
	ps.setInt(1,S_id);
	ps.setString(2,firstname);
	ps.setString(3,lastname);
	ps.setInt(4, salary);
	ps.setString(5,city);
	ps.executeUpdate();
	ps.close();	
	out.print("Records are inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
			out.print(e.getMessage());
		}
	
		
	}

}
