package day23_loopsArrays;
import java.util.Scanner;
public class BruteForce {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expectedUsername = "admin"; // expected username
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;
		
		
		do {
		if(attempts == 0) {
			System.out.println("You have exceeded number of attempts");
			System.out.println("This user has been deactivated for thirty minutes");
			return;
		}
		attempts--;
		System.out.println("Please enter user name");
		username = scan.next();
		if(!username.equals(expectedUsername)) {
			System.out.println("Wrong username");
			System.out.println("Attempts left: "+ attempts);
			continue;
		}
		System.out.println("PLease enter the password");
		password = scan.next();
		if(!password.equals(expectedPassword)) {
			System.out.println("Wrong password");
			System.out.println("Attempts left: "+ attempts);
			continue;
		}
			
		}while(!username.equals(expectedUsername) || !password.equals(expectedPassword));
		System.out.println("Login successful");
		
		
		
		
		
		
	}
}
