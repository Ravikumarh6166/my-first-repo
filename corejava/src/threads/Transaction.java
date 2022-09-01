package threads;

public class Transaction extends Thread {
	static int balance=1000;
	
	public void run() {
		
		for(int i=0; i<10; i++) {
			withdraw(150);
		}
	}

	private synchronized static void withdraw(int amnt) {
		System.out.println("Trying to withdrawn "+Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(balance>200) {
			
		balance=balance-amnt;
		
		System.out.println("The remaining amount in bank"+balance);
	}
		else {
			System.out.println("Insufficient Balance");
		}

}
		

}
