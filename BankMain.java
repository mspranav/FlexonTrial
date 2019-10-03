import java.lang.String;
import java.util.*;

public class BankMain extends  Bank{
	
	public BankMain() {
		super();
		
	}
	
	public static void main(String args[]) {
		Bank obj = new Bank();
		while(true) {
			System.out.println("Select the Operations from below");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Show Balance");
			System.out.println("4.Exit");
//			System.out.println("5.Create Account"); //create another object 
			System.out.println("Your choice");
			Scanner scnobj = new Scanner(System.in);
			if (scnobj.hasNextInt() == true) {
				int userchoice = scnobj.nextInt();
				//switch case
			}
			
			
			
		}
	}
}