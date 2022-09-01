package week2;

public class AccountDetails {
 
	private long accountnum;
	private String Accountname,email;
	private float amount;
	
	public long getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(long accountnum) {
		this.accountnum = accountnum;
	}
	public String getAccountname() {
		return Accountname;
	}
	public void setAccountname(String accountname) {
		Accountname = accountname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountnum=" + accountnum + ", Accountname=" + Accountname + ", email=" + email
				+ ", amount=" + amount + "]";
	}
	
	
	
	
}
