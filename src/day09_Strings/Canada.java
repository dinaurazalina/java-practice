package day09_Strings;
import java.util.Scanner;

public class Canada {
public static void main(String[] args) {
	System.out.println("What is the capital of Canada?");

Scanner scan = new Scanner(System.in);

String capital = scan.nextLine();

if (capital.equalsIgnoreCase("Ottawa")) {
	System.out.println("Your answer is correct");
}else {
	System.out.println("Your answer is incorrect! " + capital + " is not a capital of Canada");
}




}
	
}
