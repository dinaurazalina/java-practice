package day07;
import java.util.Scanner;
public class EnoughPizza {

	public static void main(String[] args) {
	
		
		  
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter your area code: ");
		  int areaCode = scan.nextInt();
		  System.out.println("Enter your local number: ");
		  int localNumber = scan.nextInt();
		
		  String phonenumber = scan.next();
		  phonenumber = "(" +areaCode + ") -" + localNumber;
		  
		   System.out.println("Calling number " + phonenumber);
		  
	}
}
