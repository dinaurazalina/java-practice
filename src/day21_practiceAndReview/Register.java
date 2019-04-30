package day21_practiceAndReview;
import java.util.*;
public class Register {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("How many items are you puchasing?");
	int times = scan.nextInt();
	String name;
	String items = "";
	
	double itemPrice;
	double totalPrice = 0;
	
	for (int i = 1; i <= times; i++) {
		System.out.println("What is item " + i);
		 name = scan.next();
		System.out.println("How much is " + name +"?");
		itemPrice = scan.nextDouble();
			
		
		items += name + ", "; 
		totalPrice += itemPrice;
		if(items.charAt(items.length()-2) == ',') {
			items = items.substring(0, items.length()-2);
		}
	}
	System.out.println();
	System.out.println("-------------------------");
	System.out.println("Your items: " +items);
	System.out.println();
	System.out.println("Your total Price: $" +totalPrice);
}
}
