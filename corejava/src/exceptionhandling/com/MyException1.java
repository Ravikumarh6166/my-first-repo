package exceptionhandling.com;

    public class MyException1 extends Exception {
	public static int accno[] = { 5001, 5002, 5003, 5004, 5005 };
	public static String name[] = { "Mahesh","Ravi","Raju","Charulata","Ramachari" };
	public static double balance[] = { 5000, 10000, 2000, 3000, 999 };

	MyException1() {

	}

	MyException1(String str) {
		super(str);
	}

	public static void main(String[] args) {

		try

		{

			System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
			for (int i = 0; i < 5; i++) {
				System.out.println(accno[i] + "\t" + name[i] + "\t" + balance[i]);

				if (balance[i] < 1000) {
					MyException1 me = new MyException1("Balance amount is less");
					throw me;
				}
			}
		} catch (MyException1 me) {
			me.printStackTrace();
		}
	}
}
