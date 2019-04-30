package savitchBookExercises;

public class StringLengthCommand {
public static void main(String[] args) {
	
	int n = "Hello".length();
	System.out.println(n);
	
	String greeting= "Hello, Dina. I haven't seen you in a while! ";
	int n1 = greeting.length();
//for methods like length no args are needed so the parentheses are empty
	System.out.println(n1);
	
	//method that calculates how many characters in your string
	
	String command = "Sit Poohchi!";
	String answer = "bow - wow";
	int count = command.length();
	System.out.println("The length is " + count);
	
	// method which tells you what is certain letter's order
	
	String s = "Dina";
	char c = s.charAt(1);
	System.out.println(c);

	// method which concatenates two strings
	String s2 = s.concat("saur");
	System.out.println(s2);
	
	
	//method that compares two strings
	boolean b = s.equals("Dina");
	System.out.println(b = true);
	
	
	//method that compares two string and ignores the case
	
	boolean e = s.equalsIgnoreCase("dina");
	System.out.println(e = true);
	
	
	//method that convert all the characters to UPPERCASE
	
	s2 = s.toUpperCase();
	System.out.println(s2);
	
	//method that converts all the characters to lowercase
	
	s2 = s.toLowerCase();
	System.out.println(s2);
	 
	
	s2 = s.replace('a', 'o');
	System.out.println(s2 + "saur");
}
}
