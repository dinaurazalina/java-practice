package day37_ArrayLisr;
import java.util.*;
public class ArrayAsList {

	public static void main(String[] args) {
		List <String> cars= new ArrayList<>();
		cars.add("Honda");
		
		
		//declare and add value in single statement
		//Arrays class
		List<Integer> nums= Arrays.asList(1, 2, 4, 8, 6, 4, 43, 7);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		
		//create arrayListprices
		//assign 10 values using Arrays.asList method
		
		
		
		List<Double> prices = Arrays.asList(100.4, 455.9, 23.5, 332.3, 876.00,
											34.9, 12.10, 342.5, 1.9, 9.00);
	
		System.out.println(prices.toString());
		
		//calculate the sum
		
		double sum = 0.0;
		
		for(double total: prices) {
			sum +=total;
		}
		System.out.println("Sum of the prices above is - " + sum);
	
		double sum2= 0;
		for(int i =0; i< prices.size(); i++) {
			sum2 +=prices.get(i);
		}
		System.out.println("Sum of prices using for loop "+ sum2);
		
		
		//create new list expensive
		//add prices that are more than 100
		
		
		ArrayList<Double>expensive = new ArrayList<>();
		
		for(int i = 0; i < prices.size(); i ++) {
			if(prices.get(i)>=100) {
				expensive.add(prices.get(i));
			}
		}
		
		System.out.println("Expensive items: " + expensive.toString());
		
	
		List<Double> cheap = new ArrayList<>();
		for(double price: prices) {
			if(price < 100) {
				cheap.add(price);
			}
		}
		System.out.println("Cheap items: "+ cheap.toString());
		
	    int max = Integer.MIN_VALUE;
		
	}
}
