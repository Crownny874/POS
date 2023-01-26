
import java.util.*;
public class LoginTwo {
	 LoginTwo(String name,int id,String password,Scanner sc) {
	if(!(name.equals(null)) && id != -1 && (!password.equals(null))) {
		 System.out.println("enter 'login' to sign in") ;
		 String login = sc.next();
		 System.out.println("Login successful!!!");
		  new POSInterface();
	 	}
	}
}