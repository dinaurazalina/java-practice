package day16_stringManipulation;
import java.util.Scanner;
public class replace {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Type words:");
	
		String word = scan.nextLine();

		System.out.println(word.replace("a", "y"));
		System.out.println(word.replace("sad", "happy"));
}
}
