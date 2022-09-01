package threads;

public class JobTriggers {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * for(int i=0;i<=10;i++) { System.out.println("Trigger1="+i); }
		 */
		System.out.println("In main>>11" + Thread.currentThread().getName());
		Job jb = new Job();
		jb.setName("Filpkart");
		Thread.sleep(4000);
		jb.start();
		System.out.println("In main>>22" + Thread.currentThread().getName());
		Job jb1 = new Job();
		jb1.setName("Amazon");
		jb1.start();
		System.out.println("In main>>33" + Thread.currentThread().getName());

		/*
		 * for(int i=20; i<=30;i++) { System.out.println("Trigger2="+i); }
		 */
	}

}
