package com.fsg.org;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String inQuery1="insert into student values(3,'Charulata','cse')";
		String inQuery2="insert into student values(4,'Chandana','ise')";
		String inQuery3="insert into student values(5,'Ravikumar','mech')";
		
		int status=0;
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver class registred and loaded");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ravidatabase",
		            "postgres", "postgres");
			System.out.println("Established connection with DB server");
			stmt=con.createStatement();
			System.out.println("Platform is created");
			status=stmt.executeUpdate(inQuery1);
			status=stmt.executeUpdate(inQuery2);
			status=stmt.executeUpdate(inQuery3);
			System.out.println(status);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null) {
				try {
					stmt.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
	}

}
	}
}

