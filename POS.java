
public class POS {
	
	public static void main(String[] args) {
		System.out.println("           Welcome to ACN P.O.S \n  Where you can perform awesome banking operation \nADMIN LOGIN TO PERFORM OPERATION TO CUSTOMERS");
		Balance balance = new Balance();
		balance.setbalance(1000);
		new Login();
	}
}