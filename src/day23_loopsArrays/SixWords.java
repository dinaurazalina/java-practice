package day23_loopsArrays;
import java.util.*;
public class SixWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String summary = "";
		String word = "";
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Write a word");
			word = scan.next();
			
			if(word.equals("java")) {
				continue;
			}
			
			summary += word + ", ";
	
		
	}
	
		System.out.println( summary.length()> 0?summary.substring(0,
				summary.length()-2):( "");
		
		
		
		
	}
}
