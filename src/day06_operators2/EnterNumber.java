package day06_operators2;
import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //create Scanner object
		
		System.out.println("Enter a number: ");
		
		
		int number = scan.nextInt();  // here it is waiting for me to enter a number 
		
		System.out.println("You entered " + number);
		
		
	}
}
