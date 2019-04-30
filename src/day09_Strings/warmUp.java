package day09_Strings;
import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int seniorCitizens, nonSeniorCitizens, age;
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		
		
		seniorCitizens = scan.nextInt();
		nonSeniorCitizens = scan.nextInt();
		
				
			
		System.out.println("What is new citizen's age?");
		
		age = scan.nextInt();
		
		 if (age >= 65) {
			 System.out.println("Senior Citizen");
			 System.out.println(++seniorCitizens);
		 }
		 
		 if (age < 65) {
			 System.out.println(++nonSeniorCitizens);			 
		 }
		 
		 System.out.println("New seniorCitizens count " + seniorCitizens);
		 System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
	}

}
