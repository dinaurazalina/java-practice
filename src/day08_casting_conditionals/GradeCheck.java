package day08_casting_conditionals;
import java.util.Scanner;
public class GradeCheck {
	//pseudocode
	public static void main(String[] args) {
		//A, B , C, D
		// char grade = scan.next().charAt(0);
		/* if grade 'A' => "excellent job! Keep it up!"
		 * else
		 * how many points did you miss for 'A'
		 * int points from scanner
		
		 *print "Your grade B is not good enough
		 *		You could have earned 10 more points if you studied harder"
		 */

		System.out.println("### START OF THE PROGRAM ###");
		System.out.println("What is your grade?");
		Scanner keyboard = new Scanner(System.in);
		
		
		char grade = keyboard.next().toUpperCase().charAt(0);
		
		if (grade == 'A') {
			
			System.out.println("excellent job! Keep it up!");
		}else {
			System.out.println("Your grade " + grade + " is not good enough");
			System.out.println("how many points did you miss for 'A'");
			int points = keyboard.nextInt();
			System.out.println("You could have earned "+ points +" more points if you studied harder");
		
		
		
		}
		
		System.out.println("### END OF THE PROGRAM ###");
		
		
		
	}

}
