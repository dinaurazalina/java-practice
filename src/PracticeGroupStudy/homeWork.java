package PracticeGroupStudy;
import java.util.Scanner;
public class homeWork {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	    
	    System.out.println("Enter your first name");
	    String firstName = scan.next();
	    
	    System.out.println("Enter your last name");
	    String lastName = scan.next();
	    
	    System.out.println("Enter your email");
	    String email = scan.next();
	  
	    System.out.print("Please enter street");
	    String street = scan.next();
	    
	    System.out.println("Enter your state");
	    String state = scan.next();
	    
	    System.out.println("Enter your city");
	    String city = scan.next();
	    
	    System.out.println("Enter your age");
	    int age = scan.nextInt();
	    
	    System.out.println("Enter your zip code");
	    int zipcode = scan.nextInt();
	    
	    System.out.println("Enter your height");
	    double height = scan.nextDouble();
	    
	    System.out.println("Enter your weight");
	    double weight = scan.nextDouble();
	    
	  
	    System.out.println("Are you married?");
	    boolean isMarried = scan.nextBoolean();
	    
	    System.out.println("Enter your work phone number");
	  
	    long workPhoneNumber = scan.nextLong();
	    
	  System.out.println("Enter your personal phone number");
	    long personalPhoneNumber = scan.nextLong();
	    
	    String fullName = firstName +", " +lastName;
	    System.out.println("Patient personal information");
	    System.out.println("Full name: " + fullName);
	    
	     String address = street + city + state + zipcode;
	    System.out.println("Address: " + address);
	    String contacts = "work phone number - " + workPhoneNumber+", personal phone number - " + personalPhoneNumber +",  email: "+ email;
	    System.out.println("Contacts: " + contacts);
	    System.out.println("Age: " + age);
	    System.out.println("Height: " + height);
	    System.out.println("Weight: " + weight);
	    System.out.println("Married?: " + isMarried);
	}
}
