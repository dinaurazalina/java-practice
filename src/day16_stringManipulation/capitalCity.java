package day16_stringManipulation;

public class capitalCity {
 public static void main(String[] args) {
	 
	 
	 
	String str = "Moscow is a capital of Russia";
	
	str = str.replace("Moscow","Baku").replace ("Russia", "Azerbaijan");
	System.out.println(str);
	
	String email = "dina@gmail.com";
	
	String company = "deloitte";
	
	String newEmail = email.replace("gmail", company);
	System.out.println(newEmail);
}
}
