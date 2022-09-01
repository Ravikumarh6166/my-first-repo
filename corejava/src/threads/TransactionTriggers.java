package threads;

public class TransactionTriggers {

	public static void main(String[] args) {
		Transaction tt=new Transaction();
		tt.setName("Amazon");
		tt.start();
		Transaction tt1=new Transaction();
		tt1.setName("Flipkart");
		tt1.start();
	}

}
