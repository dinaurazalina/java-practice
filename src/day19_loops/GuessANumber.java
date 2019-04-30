package day19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("##### WELCOME TO GUESS A NUMBER GAME #####");
		
		int secretNum = random.nextInt(101);
		int guessNum;
		int count = 0;

		do {
			System.out.println("Guess a number from 1 to 100:");
			guessNum = scan.nextInt();
			count++;
//			if (count  > 3 && guessNum != secretNum) {
//				System.out.println("Sorry you lost.");
//				System.exit(0);
//			}
			
			if (guessNum >secretNum) {
				System.out.print("Your number is too large. Tries left: ");
				System.out.println(5 - count);
			}else if(guessNum < secretNum) {
				System.out.print("Your number is too small. Tries left:");
				System.out.println(5 - count);
			}
		
			
		} while (guessNum != secretNum && count <= 5);
		System.out.println("Sorry you lost.");
		
		
		
	
}
}