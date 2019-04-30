package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkTwo {
	public static void main(String[] args) {
		System.out.println("\"Welcome to the Grader! \"");
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("\"Please enter subject name number 1 "
				+ "and score for this subject\"");
		String subject1 = scan.next();
		Double grade1 = scan.nextDouble();
		
		System.out.println("\"Please enter subject name number 2 "
				+ "and score for this subject\"");
		String subject2 = scan.next();
		Double grade2 = scan.nextDouble();
		
		System.out.println("\"Please enter subject name number 3 "
				+ "and score for this subject\"");
		String subject3 = scan.next();
		Double grade3 = scan.nextDouble();
		
		System.out.println("\"Please enter subject name number 4 "
				+ "and score for this subject\"");
		String subject4 = scan.next();
		Double grade4 = scan.nextDouble();
		
		System.out.println("\"Please enter subject name number 5 "
				+ "and score for this subject\"");
		String subject5 = scan.next();
		Double grade5 = scan.nextDouble();
		
		String summary = subject1 + " - " + grade1 + ", " + subject2 + " - " + grade2 + ", "
		+ subject3 + " - " + grade3 + ", " + subject4 + " - " + grade4 + ", "
		+ subject5 + " - " + grade5;
		System.out.println(" \"Summary: " + summary + "\"");
		
		float average = (float)((grade1 +grade2 +grade3 +grade4 +grade5)/5.0);
		System.out.println(" \"Your average score is: " + average + "\"");
		System.out.println("\"Thank you for using Grader!\"");
		System.out.println("\"Goodbye!\"");

		
		
	}

}
