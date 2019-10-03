import java.util.*; 

public class Bank{
	float accnumber;
	String customername = new String("");
	float balance;
	String email = new String("");
	int phonenumber;
	int depositnumber = 0;
	
	public void Bank(){
		accnumber = 123456789;
		balance = (float) 50.0;
		customername = "mspranav";
		email = "mspranav@gmail.com";
		phonenumber = 101;	
	}
	
	public String deposit(float amt) {
		if (amt > 50 && amt < 500 && depositnumber <= 3) {
			balance += amt;
			depositnumber += 1;
			return "Deposited";
			
		}
		else {
			System.out.println("Error Occureed w.r.t. amt");
		}
		
	}
	
	public int withdraw(float amt) {
		if (amt <= balance && amt <= 1000) {
			balance -= amt;
		}
		else {
			System.out.print("Insufficient Funds");
		}
	}
	
	public void getBalance() {
//		return
		System.out.println(customername);
		System.out.println(balance);
		
	}
	
}