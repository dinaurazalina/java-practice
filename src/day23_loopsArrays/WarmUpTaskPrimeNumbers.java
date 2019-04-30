package day23_loopsArrays;
import java.util.*;
public class WarmUpTaskPrimeNumbers {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	int num = scan.nextInt();
	/*prime number is a number that is ONLY can be divided by 1 and itself
	 * we start the loop from 2 since all the numbers can be divided by 1 
	 * if there is a remainder after dividing the number by 2, 3, 4 ... it is a prime number
	 * if there is no remainder after dividing by 2 and so on that means it is not a prime number
	 */
	
	
	for(int i = 2; i < num; i++) {
		if(num%i ==0) {
			System.out.println("Number not is prime");
			break;
		}else{
			System.out.println("Number is prime");
			break;
		}
	}
	
}
}
