import java.util.*;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class fInstructions {
	   static String value;
	    fInstructions(Scanner sc,String name,int id,String password) {
    List<String> pass = new ArrayList<>();
		pass.add("Henry123@#$");
		value = pass.get(0);
  if(password.contains(value)) {
		 new LoginTwo(name,id,password,sc);
		}
		else {
		System.out.println("Wrong password");
		}
  }
}