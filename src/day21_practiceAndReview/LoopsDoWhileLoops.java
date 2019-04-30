package day21_practiceAndReview;
import java.util.Scanner;
public class LoopsDoWhileLoops {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int num1, num2;
	do {
		System.out.println("Enter 2 numbers: ");
		
	 num1 = scan.nextInt();
	 num2 = scan.nextInt();
	}while(num1 + num2 <100);
	
System.out.println("Good numbers");

}
 
}
