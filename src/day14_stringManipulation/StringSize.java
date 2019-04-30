package day14_stringManipulation;

public class StringSize {

	public static void main(String[] args) {
		
		String str1 = "Good Morning";
		//check if it matches "Good morning" and print match/ not match
		
		
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
		
		if(str1.equalsIgnoreCase("Good Morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not match");
		}
		
		//Convert to all upper case 
		
		System.out.println(str1.toUpperCase());
		str1= str1.toUpperCase();
		System.out.println("After assignment: "+str1);
		
		//combine the above methods together
 		//convert to all lowercase first check if it equals("good morning")
	
	
	if(str1.toLowerCase().equals("good morning")) {
		System.out.println("Chained methods: match" );
	}else {
		System.out.println("Chained methods: do not match");
	}
	
	
	
	//FIND OUT HOW MANY CHARACTERS IN THE STRING 
	
	String myName = "Dina";
	
	System.out.println(myName.length());
	
	int length = myName.length();
	System.out.println("My name's length is " + length);
	
	
	//usernames cannot be longer than 8 characters
	
	String userName = "MyGoodUserName";
	if(userName.length() == 8) {
		System.out.println("Super User Name!");
	}else {
		System.out.println("Invalid username. Username has to be 8 characters max");
	}
	
	//password must be at least 6 chars
	
	String password = "PoohchiBabe";
	
	if(password.length() >= 6) {
		System.out.println("Good password");
	}else {
		System.out.println("Not enough characters");
	}
	
	int passwordLength = password.length();
	if (passwordLength < 6) {
	System.out.println("Not enough characters");
	}else {
	System.out.println("Good password");
	}
	
	}
}
