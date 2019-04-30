package PracticeGroupStudy;
import java.util.*;
public class ShoppingList2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		String output = "";
		
		do {
			System.out.println("Enter Item"+ count+" and its price:");
			item = scan.next();
			price = scan.nextDouble();
			System.out.println("Add one more item?");
			countinue = scan.next();
			

			totalPrice += price;
			output += "Item" + count + ": " + item + " Price: " + price +", ";
			count++;
		}while(countinue.equalsIgnoreCase("Yes"));		
		
		
		System.out.println(output.substring(0, output.length()-2));
		System.out.println("Total price: " + totalPrice);
	
	
	
	
	
	}
}
