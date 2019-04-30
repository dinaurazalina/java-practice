package day08_casting_conditionals;
import java.util.Scanner;
public class VotingEligibility {

	public static void main(String[] args) {
		
		Scanner ageEligibilty = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		int votingAge = 18;
		
		int yourAge = ageEligibilty.nextInt();
	
		
		if(yourAge < votingAge) {
			
			System.out.print("You are not eligible to vote yet. \nYou still have ");
			System.out.println(votingAge - yourAge + " "+ "to go. Thank you.");
			
		}else { 
			System.out.println("You are eligible to vote");
			System.out.print("You have been eligible for "+ (yourAge - votingAge) + " years.");
			
		}
		
		
	}
	
}
