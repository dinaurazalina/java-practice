package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkMaxPayne {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE 
    System.out.println("Enter full name:");
    String fullName = scan.nextLine();
    if ((fullName.equalsIgnoreCase("Max Payne"))||(fullName.equalsIgnoreCase("Alan Wake"))) {
    	System.out.println("User found!");
    }else {
    	System.out.println("User not found!");
    }
    
    
    
    
    
    
    String word = scan.next();
    
  if ((word.length()%2 == 1)&& word.length()>=5) {
	   System.out.print(word.charAt(word.length()/2 - 1));
	   System.out.print(word.charAt(word.length()/2));
	   System.out.print(word.charAt(word.length()/2 + 1));
  }else {
	  System.out.println("invalid");
  }
}
}
