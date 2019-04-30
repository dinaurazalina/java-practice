package day11_logical_nestedif;
import java.util.Scanner;

public class ageWarmUp {
public static void main(String[] args) {
	 
	
	System.out.println("Enter age:");
	Scanner scan = new Scanner(System.in);
	 int variableAge = scan.nextInt();
	 
	 if(variableAge < 2) {
		 System.out.println("ineligible");
	 }else if (variableAge == 2) {
		 System.out.println("toddler");
	 }else if(variableAge >=3 && variableAge <=5) {
		 System.out.println("early childhood");
	 }else if(variableAge >=6 && variableAge <= 7) {
		 System.out.println("young reader");
	 }else if(variableAge >= 8 && variableAge <= 10 ) {
		 System.out.println("elementary");
	 }else if(variableAge ==11 && variableAge ==12) {
		 System.out.println("middle");
	 }else if(variableAge == 13) {
		 System.out.println("impossible");
	 }else if (variableAge >= 14 && variableAge <= 16) {
		 System.out.println("high school");
	 }else if (variableAge >=  17 && variableAge <= 18) {
		 System.out.println("scholar");
	 }else if (variableAge >18) {
			 System.out.println("ineligible");
	  

	 }

}
}
