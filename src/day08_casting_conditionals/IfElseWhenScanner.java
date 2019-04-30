package day08_casting_conditionals;
import java.util.Scanner;

public class IfElseWhenScanner {
public static void main(String[] args) {
	
	
	//passing percentage  = 65;
	//yourScorePercentage = take from scanner
	//check if you passed
	
	
	int passingPercentage = 65;
	
	Scanner test = new Scanner(System.in);
	
	System.out.println("Enter your score: ");
	
	
	int yourScore =  test.nextInt();
	 if (yourScore >=  passingPercentage)
	 {
		 System.out.println("You passed!");
	 }else {
		 System.out.println("You failed. Try next time");
	
	 
	 System.out.println("JAVA is fun!");
	 }

}
}
