//import java.util.Arrays;
import java.util.*;


public class ArrayMain {

    public ArrayMain(){
        super();
    }

    public static void main(String args[]) {
        Scanner scnobj = new Scanner(System.in);
//        System.out.println("How many numbers do you want to enter?");
//        int x = scnobj.nextInt();
//        int[] numbers = new int[x];
        System.out.println("How many numbers do you want to enter?");
        int x = scnobj.nextInt();
        int[] numbers = new int[x];
        for(int i =0 ; i < x; i++){
            System.out.println("Enter a number");
            numbers[i] = scnobj.nextInt();
        }
        //System.out.println(numbers);
        ArrayMethods obj = new ArrayMethods();
        int number;
        String flag = new String();
        String A = new String("A");
        //char flag;
        while(true) {
            System.out.println("\n \n ---------------------------------------------- \n \n");
            System.out.println("Select the Operations to the Array from below");
            System.out.println("1.Retrieve Integer from the Index");
            System.out.println("2.Print Array");
            System.out.println("3.Get Minimum value");
            System.out.println("4.Get Maximum value");
            System.out.println("5.Reverse the Array");
            System.out.println("6.Sort the Array");
//            System.out.println("4.Get Transaction History");
            System.out.println("7.Exit");
//			System.out.println("5.Create Account"); //create another object
            System.out.println("Your choice");

            if (scnobj.hasNextInt() == true) {
                int userchoice = scnobj.nextInt();
                //switch case
                switch(userchoice){

                    case 1:
                        System.out.println("\n Enter the index:");
                        x = scnobj.nextInt();
                        System.out.println(numbers[x]);
                        //obj.appendtoarray(numbers, number);
                        //obj.getBalance();
                        break;

                    case 2: obj.getArray(numbers);
                            break;

                    case 4: obj.getMaximum(numbers);// + (String)obj.getBalance() );
                            break;

                    case 3: obj.getMinimum(numbers);
                            break;

                    case 5: obj.getreverse(numbers);
                            break;

                    case 6: System.out.println("Do you want the sort in Ascending or Descending : Type A or D");
                        flag = scnobj.next();
                        if (flag.equalsIgnoreCase("A") == true) {
                            obj.ascendingsort(numbers);
                        }
                        else{
                            obj.descendingsort(numbers);
                        }
                        //obj.withdraw(amt);
                        //obj.getBalance();
                        break;

                    case 7: System.exit(0);

                    default: System.out.println("\n\nPlease enter a valid choice");
                }
            }

            //System.out.println("testing");

        }




    }
}