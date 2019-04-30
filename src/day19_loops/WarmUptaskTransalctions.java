package day19_loops;

import java.util.Scanner;

public class WarmUptaskTransalctions {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Bank Of America!");
		System.out.println("Please select the language: 1 for English or 2 for Spanish");
		int lang = scan.nextInt();
		switch (lang) {
		case 1:
			System.out.println("Please select the operation:");
			break;
		case 2: 
			System.out.println("Yo ne se habla Espanol. Study English ");
			
		}
		
		System.out.println("For witdrawal please press 1");
		int withd = scan.nextInt();
		switch (withd) {
		case 1:
		

		System.out.println("Enter your balance: ");
		double balance = scan.nextDouble();
		int numberOfTran = 0;
		double transaction;
		String yesNo;
		
		while (balance > 0) {
			System.out.println("Enter transaction amount:");
			++numberOfTran;
			transaction = scan.nextDouble();
			balance -= transaction;
			
			if (balance < transaction) {
				System.out.println("WARNING: You have unsufficient funds.");	
				System.out.println("Do you still want to contiue?");
				yesNo = scan.next();
				
				if (yesNo.equalsIgnoreCase("Yes")) {
					balance -= transaction * 0.01;
					System.out.println("Your current balance with overdrawn fee " + balance);
				}else {
					System.out.println("Return to the main Menu ");
					balance = balance + transaction;
				}
				
				}
			
			System.out.println("Would you like to make another transaction? ");
			String yesNo1 = scan.next();
			if (!yesNo1.equalsIgnoreCase("Yes")) {
				System.out.println("Thank you for using Bank of America");
			}
				
					System.out.println("Your remaining balance is "+ balance);
		}
		
	
	System.out.println("Transactions amount: " + numberOfTran);
	break;
		}
		
	
		
		
		
	}
	
}