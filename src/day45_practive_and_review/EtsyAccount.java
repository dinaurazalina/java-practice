package day45_practive_and_review;

import java.util.Random;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;
	
	//constructor 1.No args. Sets all as empty string
	
	public EtsyAccount() {
		email 	  = "";
		firstName = "";
		password  = "";
	}
	
	//constructor 2: Takes three args and sets them to instance variables 
	//using setters
	
	public EtsyAccount(String email, String firstName, String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
		
	}
	
	//constructor 3. in order to autogenerate password
	
	public EtsyAccount(String email, String firstName) {
		
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();
				//random with 6 character
	}
	
	
	
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.indexOf("@") >=1 && email.indexOf("@") < email.length()-1) {
		this.email = email;
		}else {
			System.out.println("Please enter a valid email address");
		}
	}
	public String getFirstName() {
		
		
		
			return firstName;
		
	}
	private boolean isValidFirstName(String firstName) {
		//check if it starts or ends with " "
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		if(firstName.isEmpty()) {
			System.out.println("Cannot be blank");
		return false;
		}
	
		
	for(int i = 0; i< firstName.length(); i++) {
		char c = firstName.charAt(i);
		if(!Character.isAlphabetic(c) && c != ' ') {
			return false;
		}
	}
		return true;
	}
	
	public void setFirstName(String firstName) {
		if(isValidFirstName(firstName)) {
		this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() >=6) {
		this.password = password;
		}else {
			System.out.println("Your password must be at least 6 characters");
		}
	}
	private String getRandomPassword() {
		Random rand = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz1234567890";
		String randomPw ="";
		for(int i =0; i <= 6; i++) {
			randomPw += letters.charAt(rand.nextInt(letters.length()-1));
		}
		return randomPw;
	}

	
}
