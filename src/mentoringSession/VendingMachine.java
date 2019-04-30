package mentoringSession;
import java.util.*;

public class VendingMachine {
	public static void main(String[] args) {
		
	
		System.out.println("Enter price in cents:");
		Scanner scan = new Scanner(System.in);
		int itemPrice = scan.nextInt();
		int quaters, dimes, nickels;
		
		
		 if ( itemPrice<25 ){
			
				System.out.println("Invalid price!");
			
			}else if (itemPrice >100){
			  System.out.println("Invalid price!");
			} else if (itemPrice%5 != 0){
			  System.out.println("Invalid price!");
		  
		}else{
		  
			quaters = (100-itemPrice)/25;
			dimes = (100-itemPrice)%25/10;
			nickels = (100-itemPrice)%25%10/5;
			System.out.println("Your change is " + quaters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");

		}
			

		  
		  
		 

		
		
			
	    
	  }
	}

