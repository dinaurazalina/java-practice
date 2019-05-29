package OfficeHourswithMurodil6to7;
import java.util.*;
public class MaskArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		List<String> input = new ArrayList<>();
		List<String> masked = new ArrayList<>();
		List<Integer> lengthsList = new ArrayList<>();
	
	String answer = "";
	do {
	System.out.print("Enter word");
	String word = scan.next();	
	input.add(word);
	System.out.println(masked(word));
	
	masked.add(masked(word));
	lengthsList.add(word.length());
	System.out.println("You want to add another word?");
	answer= scan.next();
	}while(answer.equalsIgnoreCase("yes"));
	
	
	System.out.println(input.toString());
	System.out.println(masked.toString());
	System.out.println(lengthsList.toString());
	}
	public static String masked (String word) {
		String stars="";
		for(int i= 0; i<word.length();i++) {
			stars+="*";
		
		}
	return stars;
	}
}
