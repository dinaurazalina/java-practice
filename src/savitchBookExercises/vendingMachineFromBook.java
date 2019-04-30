package savitchBookExercises;
import java.util.Scanner;
public class vendingMachineFromBook {

	public static void main(String[] args) {
		
		int amount, originalAmount, 
		quarters, dimes, nickels, pennies;
		
		System.out.println("Enter the whole number from 1 to 99.");
		System.out.println("I will fins a combination of coins.");
		System.out.println("that equals that amount of change.");
		
		Scanner scan = new Scanner(System.in);
		amount = scan.nextInt();
		originalAmount = amount;
		quarters = amount /25;
		amount = amount%25;
		dimes = amount/10;
		amount = amount%10;
		nickels = amount/5;
		amount = amount%5;
		pennies = amount;
				
				System.out.println(originalAmount + " cents in coins can be given as: ");
				if (quarters == 1) {
				System.out.print(quarters + " quarter, ");
				} else {
					System.out.println(quarters + " quarter, ");
				}if (dimes ==1) {
					System.out.print(dimes + " dime, ");
				}else {
					System.out.print(dimes + " dimes, ");
				}
				
				
				
				if (nickels ==1) {
					System.out.print(nickels + " nickel, and ");
				}else {
				System.out.print(nickels + " nickels, and ");
				}
				
				if (pennies ==1) {
					
					System.out.print(pennies + " penny");
				}else {
				System.out.print(pennies + " pennies");
	}
				
	}
}
