package day20_loops;
import java.util.*;
public class PrintEachChar {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String word = scan.nextLine();
	//using for loop print each char one by one
	
	for (int i = 0; i <= word.length()-1; i++) {
		System.out.println(word.charAt(i));
	}

	System.out.println();
	
	//using for loop print only vowels(e,a, u, i, o, y)
	
	for (int i = 0; i <= word.length()-1; i++) {
		word = word.toLowerCase();
		char letter = word.charAt(i);
		
		if(letter == 'a' || letter == 'e' ||letter == 'u' ||letter == 'y' ||letter == 'o' ||letter == 'i') {
			System.out.print(letter +", ");
		}
		
		
	}
	
	
	System.out.println();
	System.out.println();
	
	
	for (int i = 0; i <= word.length()-1; i++) {
		word = word.toLowerCase();
		char letter = word.charAt(i);
		
		if(!(letter == 'a' || letter == 'e' ||letter == 'u' ||letter == 'y' ||letter == 'o' ||letter == 'i')) {
			System.out.print(letter +", ");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
}
