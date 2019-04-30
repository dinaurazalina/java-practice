package PracticeGroupStudy;

import java.util.Scanner;

	public class practiceScanner {
		public static void main(String[] args) {
			
			Scanner DinaRules = new Scanner(System.in);
			
			System.out.println("what is the purpose of studying in Cybertek?");
			String myGoal = DinaRules.nextLine();
			System.out.println("");
			
			
			System.out.println("Can you identify your gender? ");
			char gender = DinaRules.next().charAt(0);
			
			System.out.println("How long do you think it takes to reach your first goal? ");
			
			int howLong = DinaRules.nextInt();
			
			System.out.println("What is your income going to be?");
			
			long myIncome = DinaRules.nextLong();
			
			System.out.println("How many countries do you plan to visit? ");
			
			byte myTravelList = DinaRules.nextByte();
			
			System.out.println("How lucky do you think you are?");
			
			double myLuck = DinaRules.nextDouble();
			
		
		
			

		}

}
