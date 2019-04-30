package day11_logical_nestedif;
import java.util.Scanner;
public class SignInLogin {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter username:");
	String username = scan.next();
	String validUsername = "cybertek@mail.com";
	
	System.out.println("Enter password:");
	String password = scan.next();
	String validPassword = "WoodenSpoon123";
	
	
			if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Login Successful, welcome");
		}else if(!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Password");
		}

}
}
