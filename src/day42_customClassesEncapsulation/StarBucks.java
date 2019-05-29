package day42_customClassesEncapsulation;
import java.util.*;
public class StarBucks {

	public static void main(String[] args) {
		
		
		//Declare an array that can store 2 Coffee objects;
		//int [] nums = new int[2];
		
		//declare coffeearray that can store 2 coffee objects
		Coffee[] coffeeArray = new Coffee [2];
		//create coffee object and assign to index 0
		coffeeArray[0] = new Coffee();
		//accessing the coffee object in index 0 and set info
		coffeeArray[0].setCoffeeInfo("Espresso", "tall", 10, 2.99);
		// access coffee info to index 0 and call method printInfo
		coffeeArray[0].printInfo();
	
		
		
		//create a single object first 
		Coffee latte  = new Coffee();
		//assign data 
		latte.setCoffeeInfo("Latte", "Grande", 190, 3.85);
		//assign the latte object to index 1 of the array
		coffeeArray[1] = latte;
		//print data from object in index 1
		coffeeArray[1].printInfo();
	}
}
