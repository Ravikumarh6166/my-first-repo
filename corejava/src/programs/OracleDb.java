package programs;

public class OracleDb implements MyInter {
	
	

	@Override
	public void connect() {
		System.out.println("Database Conected to oracleDB");
	}

	@Override
	public void Disconnect() {
		System.out.println("database disconnected to oracleDB");
		
	}

}
