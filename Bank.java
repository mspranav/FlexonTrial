import java.util.*; 

public class Bank{
	float accnumber;
	String customername = new String("");
	float balance;
	String email = new String("");
	int phonenumber;
	int depositnumber;
	int withdrawalamt;
	// String [] transaction_history;
	List<String [] > transaction_history = new ArrayList<String []>();  

	
	public Bank(){
		accnumber = 123456789;
		balance = (float) 50.0;
		customername = "mspranav";
		email = "mspranav@gmail.com";
		phonenumber = 101;
		depositnumber = 0;	
		withdrawalamt = 1000;

	}
	
	public void deposit(float amt) {
		if (amt > 50 && amt <= 500 && depositnumber < 3) {
			System.out.println("\n");
			balance += amt;
			depositnumber += 1;
			transaction_history.add(new String []{"Deposit" , Float.toString(amt)});

			//return "Deposited";
			//System.out.println(transaction_history);
		}
		else if(depositnumber >= 3) {
			System.out.println("You have reached the Limit for # of Transactions\n");
		}
		else{
			System.out.println("Error Occureed w.r.t. amt\n");
		}
		//return "Testing";	
	}
	
	public void withdraw(float amt) {
		if (amt <= balance && amt <= 1000 && withdrawalamt > 0){ //&& balance - amt <= withdrawalamt) {
			balance -= amt;
			withdrawalamt -= amt;
			System.out.println("You can still withdraw " + withdrawalamt + " today"); 
			transaction_history.add(new String []{"Withdraw" , Float.toString(amt)});
		}
		else if (withdrawalamt == 0){
			System.out.print("Withdraw Limit Per Day - Reached\n");

		}
		else{
			System.out.println("Insufficient Funds or Withdrawal amount Limit Reached \n");
		}
	//return balance;
	}
	
	public void getTransactionHistory(){
		System.out.println("\n\n");
		for(String [] transaction: transaction_history  ) {
			System.out.println(Arrays.toString(transaction));
		}
	}

	public void  getBalance() {
//		return
		System.out.print(customername +'\n');
		System.out.println("Type : Checking");
		System.out.println(balance);
		System.out.println(java.time.LocalDate.now() +"  " + java.time.LocalTime.now());
		
	}
	
}
