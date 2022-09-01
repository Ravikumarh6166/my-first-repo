package programs;

public class SyBase implements MyInter {

	@Override
	public void connect() {
		System.out.println("connecting the sybase database");
	}

	@Override
	public void Disconnect() {
		System.out.println("disconnecting the sybase database");
	}

}
