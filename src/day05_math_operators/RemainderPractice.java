package day05_math_operators;
import java.util.Scanner;
public class RemainderPractice {
	public static void main(String[] args) {
		
		
		System.out.println("Enter your price in cents: ");
		Scanner scan = new Scanner(System.in);
		int itemPrice = scan.nextInt();
		int quaters, dimes, nickels;
		
	
			
			quaters = (100-itemPrice)/25;
			dimes = (100-itemPrice)%25/10;
			nickels = (100-itemPrice)%25%10/5;

		System.out.println("Your change is " + quaters + " quaters, " + dimes + " dimes, " + nickels + " nickels.");
	
	}

}
