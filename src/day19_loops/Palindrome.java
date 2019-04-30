package day19_loops;
import java.util.Scanner;
public class Palindrome {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	//reverse it and compare one to another
	
	String word = scan.next();
	String reversed = "";
	// loop through word in reverse order 
	//concatenate each character to reversed string 
	
	int num = word.length()-1;
	while(num >=0) {
		
		reversed = reversed + word.charAt(num);
		num--;
	}
	 
	System.out.println(reversed);
	
	if(reversed.equalsIgnoreCase(word)) {
		System.out.println("it is palindrome");
	}else {
		System.out.println("it is not a palindrome");
	}
	
	
}
}