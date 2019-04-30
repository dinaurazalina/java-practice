package day14_stringManipulation;
import java.util.Scanner;
public class StringsWords {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the first word");
	String word1 = scan.next();
	System.out.println("Enter the second word");
	String word2 = scan.next();
	
	if(word1.length() > word2.length()) {
		System.out.println(word1 + " is longer than "+ word2);
	}else if(word1.length()< word2.length()){
		System.out.println(word2 + " is longer than "+ word1);
	}else {
		System.out.println(word1 + " equals to "+ word2);
	}
}
}
