package PracticeGroupStudy;
import java.util.Scanner;

public class homeworkShoppingList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item1, count and its price:");
		String item1 = scan.next();
		int count1 = scan.nextInt();
		double price1 = scan.nextDouble();
		
		
		
		System.out.println("Enter Item2, count and its price:");
		String item2 = scan.next();
		int count2 = scan.nextInt();
		double price2 = scan.nextDouble();
		
		
		
		
		
		System.out.println("Enter Item3, count and its price:");
		String item3 = scan.next();
		int count3 = scan.nextInt();
		double price3 = scan.nextDouble();
		
	//if there are no zeros
		if (count1 > 0 && count2 >0 && count3>0){
			  System.out.println("Item1: " + item1+ " Price: " + count1*price1 + ", Item2: " + item2+ " Price: " + count2*price2 + ", Item3: " + item3+ " Price: " + count3*price3);
			  System.out.println("Total price: " + count1*price1 +count2*price2 +count3*price3);
		}
			  
	//if item 1 is zero
		if (count1==0 && count2>0 && count3> 0) {
			System.out.println("Item2: " + item2+ " Price: " + count2*price2 + ", Item3: " + item3+ " Price: " + count3*price3);
			System.out.println("Total price: " + count2*price2 +count3*price3);
		}
		
	//if item 2 is zero	
		if (count2==0 && count1 >0 && count3 > 0) {
			System.out.println("Item1: " + item1+ " Price: " + count1*price1 + ", Item3: " + item3+ " Price: " + count3*price3);
			System.out.println("Total price: " + count1*price1 +count3*price3);
		}
		
	//if item 3 is zero	
		if (count3==0 && count2>0 && count1>0) {
			System.out.println("Item1: " + item1+ " Price: " + count1*price1 + ", Item2: " + item2+ " Price: " + count2*price2);
			System.out.println("Total price: " + count1*price1 +count2*price2);
		}
	
		
	//if item 1 and 2 are zeros
		if (count1==0 && count2 ==0 && count3 > 0) {
			System.out.println("Item3: " + item3+ " Price: " + count3*price3);
			System.out.println("Total price: " +count3*price3);
		}
		
	//if item 1 and 3 are zeros
		if (count1==0 && count3 == 0 && count2>0) {
			System.out.println("Item2: " + item2+ " Price: " + count2*price2);
		
			System.out.println("Total price: " +count2*price2);
		}
			
	//if item 2 and 3 are zeros 
		if (count2==0 && count3==0 && count1 >0) {
			System.out.println("Item1: " + item1+ " Price: " + count1*price1);
			System.out.println("Total price: " + count1*price1);
		}
		
	//if all are zeros
		if (count1 == 0 && count2==0 && count3 == 0) {
			
			System.out.println();
		}
		
		
		
		
		
	}
}
