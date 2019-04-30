package day31_methods;
import java.util.*;
public class Authentication {
/*
 * Name: login
 * Return type: void
 * 2 String args/ params: username, password
 * Inside the method:
 * validUsername = "mentoring@cybertekschool.com"
 * validPassword = "mentor001"
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username: ");
		String username = scan.next();
		System.out.println("Please enter your password: ");
		String password = scan.next();
		
		login(username, password);
	}
	
	public static void login(String username, String password) {
		
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		
		if(!username.equalsIgnoreCase(validUsername)) {
			System.out.println("Incorrect email");
		}else {
			if(!password.equals(validPassword)) {
				System.out.println("Sign in failed");
			}else {
				System.out.println("Login successfull. Welcome to Okta!");
			}
			
		}
	}
	
}

