package wrapperclass;

public class Demo {

	public static void main(String[] args) {
		String price1 = "500";
		String price2 = "400";

		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		System.out.println(p1 + p2);
		int sum = p1 + p2;
		System.out.println(sum);
		if (sum == 900) {
			System.out.println("passed");
		}
		else
			System.out.println("Failled");
	}

}
