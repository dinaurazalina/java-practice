package day34_methods;

import java.util.Arrays;

public class VarArgs {

	public static void main(String...args) {
		printWords("red", "blue");//array with 2 elements
		printWords("gray");// it is still an [array] with index 0
		String  [] myPets = {"cat", "dogs", "horse", "sheep"};
		printWords(myPets);
		printWords();// empty  > so array will be empty array
		System.out.println("*** *** ***");
		
		System.out.println("Summary of entered numbers is "+sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		int budget = 200;
		if(sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within the budget");
		}else {
			System.out.println("Broke");
			
		
			
		}
		System.out.println("*** *** ***");
		
		int total = sum(34, 23, 34, 45, 67, 87, 89,90);
		System.out.println("total of entered numbers: " + total);
		System.out.println("*** *** ***");
		
		
		cook ("Burrito Bowl", "Rice", "Beans", "Meat", "Sour cream", "Cheese", "Salsa");
		cook("Avocado Toast", "Avocado", "Sunni Side Eggs", "Wheat Toast");
		System.out.println("*** *** ***");
		
		
		shoppingList(1000, "Avocado Toast", "Swatch Swatch Swatch Watch","Shoes");
		
		
		
		
		
	}
	public static void printWords(String ...words) {
		
		//handle it like an Array
		
		
	for(String w:words) {
		System.out.println(w);
	}
	}
	
	//this method return the summary of the numbers you will enter in the main method
	public static int sum(int ... nums) { //VarArgs
		int sum= 0;
		for(int numbers: nums) {
			sum +=numbers;
		}
		return sum;
	}
	
	
	public static void cook (String name, String ...ings) {
		
		System.out.print("Food: "+ name);
		System.out.println(Arrays.toString(ings));
	}
	
	
	
	public static void shoppingList(int prices, String ...items) {
		System.out.print("total cost: " + prices);
		System.out.println(Arrays.toString(items));
	}
	
	
	
}
