import java.util.*;
public class POSInterface {
	
	 POSInterface() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("        |************Inventory*************|");
	 System.out.println("1. Withdraw                          2. Deposit");
	 System.out.println("3. checkBalance                    4. Transfer");
 	System.out.println("\n\nChoose operation:");
	 String operation = sc.next();
	 
	 if(operation.equals("1")) {
		 new withdraw();
		 }
	 else if(operation.equals("2")) {
		new deposit();
		}
	 else if(operation.equals("3")) {
		Balance balance = new Balance();
		balance.setbalance(1000);
		int currentbalance = balance.getbalance();
		System.out.println("Balance: $"+currentbalance);
		}
	 else if(operation.equals("4")) {
		 new transfer();
		}
		 }
	}
