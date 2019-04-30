package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkVendingMachine {
public static void main(String[] args) {
	 
	
	System.out.println("Enter price in cents:");
	Scanner scan = new Scanner(System.in);
	int itemPrice = scan.nextInt();
	int quaters, dimes, nickels;
	
	
	if(itemPrice>=25 && itemPrice<= 100) {
			      
		quaters = (100-itemPrice)/25;
		dimes = (100-itemPrice)%25/10;
		nickels = (100-itemPrice)%25%10/5;
		System.out.println("Your change is " + quaters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
		}
	if (itemPrice%5 == 0){
		System.out.println("Invalid price!");
	} 
	
	if(itemPrice<25 && itemPrice > 100){
			System.out.println("Invalid price!");
		}
	
	
}

}
