package day20_loops;
import java.util.Scanner;
public class IndexOf {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the word:");
	String word = "amazon";
	char letter = 'm';
	int index = -1;
	
	
	for(int i = 0; i < word.length(); i++) {
	 
		if (word.charAt(i) == letter) {
			index =i ;
			break;
		}
	}
	
	System.out.println("Index of " + letter + " in the word " + word  +" is "+index);

	
	
	
	
}
}
