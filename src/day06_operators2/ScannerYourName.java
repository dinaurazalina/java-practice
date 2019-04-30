package day06_operators2;


import java.util.Scanner;

public class ScannerYourName {
	public static void main(String[] args) {
	
		// create scanner object
		
		Scanner creepyDude = new Scanner(System.in);

		
		System.out.println("Hi, What is your name? ");
		
		String name = creepyDude.next(); //accept String input
		
		System.out.println("Nice to meet you, " + name + "!");
		
	
		Scanner creepyDude2 = new Scanner(System.in);

		System.out.println("My name is Harry Porter. " + name +", where you live?");
		
		String address = creepyDude2.next(); //accept String input
		
		System.out.println("Can I come over sometime? " + address + " is not far from my place. "  );
		
		
		Scanner creepyDude3 = new Scanner(System.in);
		
		System.out.println("Do you live with you parents in " + address + "?");
		
		String parents = creepyDude3.next(); 
		
		System.out.println("Oh, no. *laughs sarcastically* You're old enough to live separately. ");
		
		
		Scanner creepyDude4 = new Scanner(System.in);
		 
		System.out.println("How many sibling do you have? ");
		
		int number = creepyDude4.nextInt(); 
		
		System.out.println(number + "?! Oh wow, that's a lot ");
		
		
		
		Scanner creepyDude5 = new Scanner(System.in);
		
		System.out.println("Have you even been to LA? ");
		
		String la  = creepyDude5.next();
		
		System.out.println();
		
		
}
}
