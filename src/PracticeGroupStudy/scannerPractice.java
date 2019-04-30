package PracticeGroupStudy;
import java.util.Scanner;

public class scannerPractice {

	public static void main(String[] args) {
		Scanner practice = new Scanner(System.in);
		
		System.out.println("Can you tell me a random number?");
		int number = practice.nextInt();
		System.out.println("I can't believe it! " + number + "? I had the same number on my mind!");
		
		System.out.println("Alright, how you any letter?");
		char letter = practice.next().charAt(0);
		System.out.println(letter + "?! Unbelivable, looks like great minds think alike");
		
		System.out.println("Now, I want you to take any card from the stack and please don't show it to me");
		String card = practice.next();
		System.out.println("Let's see ... What do you have here? " + card+ "isn't is your card?" );
		
		// New practice
		
		String name = practice.next();
		int age = practice.nextInt();
		char gender = practice.next().charAt(0);
		long phoneNumber = practice.nextLong();
		double gpa = practice.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("GPA: " + gpa);
	
	
	
	
	}
}
