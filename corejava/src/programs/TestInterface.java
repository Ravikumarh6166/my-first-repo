package programs;

public class TestInterface {
	


	public static void main(String[] args) throws Exception {
		
        Class c = Class.forName( "Oracle.jdbc.driver.OracleDriver");

		
		MyInter mi = (MyInter)c.newInstance();
		
		mi.connect();
		mi.Disconnect();
		
		/*MyInter MyInter=new OracleDb();
		MyInter.connect();
		MyInter.Disconnect();
		
		MyInter MyInter1=new SyBase();
		MyInter1.connect();
		MyInter1.Disconnect();*/
		
	}

}
