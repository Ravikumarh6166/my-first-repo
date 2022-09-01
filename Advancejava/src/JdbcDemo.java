import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
		
Connection con=null;
Statement stmt=null;
try {
	Class.forName("org.postgresql.Driver");
	System.out.println("Driver class registred and loaded");
	con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ravidatabase",
            "postgres", "postgres");
	System.out.println("Established connection with DB server");
	stmt=con.createStatement();
	System.out.println("Platform is created");
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
