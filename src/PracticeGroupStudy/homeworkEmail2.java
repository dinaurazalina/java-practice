package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkEmail2 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  String email = scan.next();
		    int index2, index, doti;
		    index2 = email.indexOf("@");
		    index = email.indexOf("_");
		    doti = email.indexOf(".");
		   
		    
    
	String firstName = email.substring(0,1).toUpperCase();
	System.out.println("First name: "+ firstName + email.substring(1, index));
	String secondName = email.substring(index+1, index+2).toUpperCase();
	System.out.println("Last name: "+secondName+ email.substring(index+2, index2));
	System.out.println("Domain: " + email.substring(index2+1, doti));
	System.out.println("Top-Level Domain: " + email.substring(doti +1));


	
	}
}
