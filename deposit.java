import java.util.*;
public class deposit {
	int newamount = 0;
	Date date = new Date();
	Balance balance = new Balance();
	 deposit() {
	 balance.setbalance(1000);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter deposit amount ($):");
	 int deposit = sc.nextInt();
	 System.out.println("enter pin:");
	 int pin = sc.nextInt();
	 int currentbalance = balance.getbalance();
	 
		if(deposit != -1) {
	 newamount = currentbalance + deposit;
	 balance.setbalance(newamount);
		}
	 if(pin == 5679) {
    	System.out.println("Deposit Amount: $"+deposit);
	    System.out.println("A/c Num: ");
    	System.out.println("DESC: POS");
    	System.out.println("Date: "+date);
    	System.out.println("Balance: $"+newamount);	
      System.out.println("transaction successful!");
		  balance.setbalance(newamount);
 	}	
	 else {
		 System.out.println("transaction fails!");
		}
			}
	}
