import java.util.*;
public class withdraw {
 Balance balance = new Balance();
 Date date = new Date();
	 withdraw() {
	 balance.setbalance(1000);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter withdrawal amount ($):");
	 int withdrawamount = sc.nextInt();
	 int currentbalance = balance.getbalance();
	 System.out.println("enter pin:");
	 int pin = sc.nextInt();
	 if(withdrawamount != -1) {
		int newamount = currentbalance - withdrawamount;
		balance.setbalance(newamount);
		printOut(withdrawamount,pin,newamount,currentbalance);
	  }
	  }
public void printOut(int withdrawamount,int pin,int newamount,int currentbalance) {
  if(pin != 5679) {
	System.out.println("A/c Num: ");
	System.out.println("DESC: POS");
	System.out.println("Date: "+date);
	System.out.println("Balance: $"+currentbalance);	
  System.out.println("transaction failed!");
	balance.setbalance(currentbalance);
 	}
		else {
	System.out.println("Debit Amount: $"+withdrawamount);
	System.out.println("A/c Num: ");
	System.out.println("DESC: POS");
	System.out.println("Date: "+date);
	System.out.println("Balance: $"+newamount);	
	System.out.println("transaction successful");
	balance.setbalance(newamount);
	}	
	}
	}