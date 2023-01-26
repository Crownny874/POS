import java.util.*;
public class transfer {
	transfer() {
		Date date = new Date();
		Balance balance = new Balance();
		balance.setbalance(1000);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter amount ($):");
	 int amount = sc.nextInt();
	 System.out.println("enter receipent account number:");
	 int num = sc.nextInt();
	 System.out.println("enter account pin:");
	 int pin = sc.nextInt(); 
		
		int cbalance = balance.getbalance();
		int newbalance = cbalance - amount;
	 if(pin == 5679) {
		balance.setbalance(newbalance);
		System.out.println("Debit amount: $"+amount);
		System.out.println("DESC: Transfer To A/c num:"+num);
		System.out.println("Date: "+date);
		System.out.println("Balance: $"+newbalance);
		System.out.println("transaction succesful!");
		balance.setbalance(newbalance);
		}
		else {
		System.out.println("transaction failed!");
		}
	}
}