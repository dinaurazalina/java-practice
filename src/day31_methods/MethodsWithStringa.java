package day31_methods;
import java.util.*;
public class MethodsWithStringa {

	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String sentence = scan.nextLine();
	countWords(sentence); 
		
	}
	/*
	 * name countWords
	 * return: void
	 * params: String sentence
	 * countWords("Java is fun")
	 * Words in this sentence [Java, is, fun]
	 * Number of words: 3
	 */
	public static void countWords (String sentence) {
		String [] countWords =sentence.split(" ");
	
	System.out.println("Words in this sentence : " + Arrays.toString(countWords) + " is " + countWords.length +".");
	}
	
	
}
