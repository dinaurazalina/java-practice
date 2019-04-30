package savitchBookExercises;
import java.util.Scanner;
public class videoGameCoupons {
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);

		int numberOfCoupons= 0, numberOfCandies, numberOfGumballs,  remainingCoupons ;
	
		System.out.println("Enter number of coupons:");
	
		
		numberOfCoupons = scan.nextInt();

		if(numberOfCoupons <3 ) {
			System.out.println("Not enough coupons");
		}
		

 	if (numberOfCoupons >=  13 )
 		
	{	numberOfCandies = numberOfCoupons/10;
		
		numberOfCoupons = numberOfCoupons%10;
		
		numberOfGumballs = numberOfCoupons/3;
		
		numberOfCoupons = numberOfCoupons%3;

		remainingCoupons = numberOfCoupons;
		
		
	System.out.println("Number of Candies: " + numberOfCandies);
	System.out.println("Number of Gumballs: " + numberOfGumballs);
	
	} else if(numberOfCoupons>= 3 && numberOfCoupons <= 12) 
	{
			  
			  System.out.println("Number of Gumballs: " + numberOfCoupons/3);
		  
	}
}
}