package day16_stringManipulation;
import java.util.Scanner;

public class subStrinh {
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);
	String sentence = "I wrote [2345] lines of code today";
	//assign to the variable print the number between [ and ]
	
	

	//System.out.println(sentence.substring(9, 11));
	
	int first = sentence.indexOf('[');
	int second = sentence.indexOf(']');
	String codeCount =sentence.substring(first+1, second);
	System.out.println("Lines of code " + codeCount);
	
	
	System.out.println("Lines of code "+ sentence.substring(sentence.indexOf('[')+1,sentence.indexOf(']')));
	
	//check if codeCount os more than 20
	
	int count = Integer.parseInt(codeCount); //convert String to int
	if (count >20) {
		System.out.println("wrote more than 20 lines of code today!");
	}
		
	
}
}
