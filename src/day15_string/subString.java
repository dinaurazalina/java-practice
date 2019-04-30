package day15_string;
import java.util.Scanner;
public class subString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = "Java String manipulation is fun!";
		
		System.out.println(sentence.substring(0, 4));

		System.out.println(sentence.substring(5,11));
	
		System.out.println(sentence.substring(7,11));
		
		
		
		
			double r = 7.5;
			double v = 3;
			System.out.println(r/v);
			System.out.println("enter a num");
			int num = scan.nextInt();
			
			if (num%2 == 1) {
				System.out.println("The number is odd");
			}else {
				System.out.println("The number is even");
			}
	
	}
}
