import java.util.*;
public class Login {
	  Login() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name");
	String name = sc.next();
	System.out.println("Enter id:");
	int id = sc.nextInt();
	System.out.println("Enter password");
	String password = sc.next();
	
  new fInstructions(sc,name,id,password);
	 	}
	 }