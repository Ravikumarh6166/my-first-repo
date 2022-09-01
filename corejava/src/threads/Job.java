package threads;

public class Job extends Thread {

	public void  run() {
		
		//for(int i =11;i<=20;i++) {
			System.out.println("In Job=" +Thread.currentThread().getName());
			//System.out.println("Jobs are="+i);
		}
	}

