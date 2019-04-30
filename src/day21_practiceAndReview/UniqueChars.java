package day21_practiceAndReview;
import java.util.*;
public class UniqueChars {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();
		String unique = "";
		for(int i = 0; i < word.length(); i++) {
		char ch = word.charAt(i);
		if(!unique.contains("" +ch)) {
			unique += ""+ ch ;
			
		}
		}	
		System.out.print(unique);
	
}
}
