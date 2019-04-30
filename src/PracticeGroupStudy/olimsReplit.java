package PracticeGroupStudy;
import java.util.Scanner;

public class olimsReplit {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Input an integer number less than ten billion:");
	    	int num = scan.nextInt();
	   
	  String num1 = ""+ num;
	  
	  int digitCounts = num1.length();
	  
	   System.out.println("Number of digits in the number: " + digitCounts);
	    

	     System.out.println("Input a degree in Fahrenheit: ");
	     int degreeF = scan.nextInt();
	     
	     int degreeC = (degreeF*9+(32* 5))/5;
	     
	     System.out.println(degreeF +"  degree Fahrenheit is equal " + to degreeC + " in Celsuis");
	     
	     }
	   }}
	}

