import java.lang.String;
import java.lang.System;
import java.util.*;

public class BankMain extends  Bank{
	
	public BankMain() {
		super();
		
	}
	
	public static void main(String args[]) {
		float amt;
		Bank obj = new Bank();
		//System.out.print(obj.customername);
		//obj.getBalance();//System.out.println(obj.getBalance());
		while(true) {
			System.out.println("\n \n ---------------------------------------------- \n \n");
			System.out.println("Select the Operations from below");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Show Balance");
			System.out.println("4.Get Transaction History");
			System.out.println("5.Exit");
//			System.out.println("5.Create Account"); //create another object 
			System.out.println("Your choice");
			Scanner scnobj = new Scanner(System.in);
			if (scnobj.hasNextInt() == true) {
				int userchoice = scnobj.nextInt();
				//switch case
				switch(userchoice){

					case 1: System.out.println("Enter Amount to be Deposited");
							amt = scnobj.nextFloat();
							obj.deposit(amt);
							//obj.getBalance();
							break;
					case 2: System.out.println("Enter Amount you wish to be withdrawn");
							amt = scnobj.nextFloat();
							obj.withdraw(amt);
							//obj.getBalance();
							break;
					case 3: System.out.println("\n\nYour Balance:");
							obj.getBalance();// + (String)obj.getBalance() );
							break;
					case 4: obj.getTransactionHistory();
							break;

					case 5: System.exit(0);

					default: System.out.println("Please enter a valid choice");
				}
			}
			
			//System.out.println("testing");
			
		}
		
	}
}
