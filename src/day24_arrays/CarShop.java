package day24_arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		
		/*
		 * BMW, Audi, Ford, Honda,Ford, Mercedes , Mercury, Rolls Royce, Tesla
		 * 
		 *  1.Create an array of strings, and store these cars inside this array
		 */
		
	
	String [] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes" , "Mercury", "Rolls Royce", "Tesla"};
	
	//Step 2: Print car name that starts with M
	for(String car1: cars) {
		if(car1.startsWith("M")) {
			System.out.println(car1);
		}
	//Step 3: Print all cars that have letter "r" somewhere in the name
		//Please make your search case insensitive
	System.out.println("****************************");
	
		for(String rs: cars) {
			if(rs.toLowerCase().contains("r")) {
				System.out.println(rs);
			}
		}
		
		//Step 4  Print car names that ends with a 
		
		System.out.println("****************************");
		
		for(String as: cars) {
			if(as.endsWith("a")) {
				System.out.println(as);
			}
		}
	//Step 5 Print car names that have 6 letters in the name
	
System.out.println("****************************");
		
		for(String six: cars) {
			if(six.length() > 5) {
				System.out.println(six);
			}
		}
	
		//Step 6 Swap first and last value 
		
System.out.println("****************************");
			//create a temp variable that will get a value of the first element
			String temp = cars [0];
		//we swap values of the first and second element
			cars [0] = cars[cars.length -1]; 
			// since temp variable has a value of the first element of array
			//we assign this value to the last element in array
			cars[cars.length -1] = temp;
		System.out.println(Arrays.toString(cars));

	
		System.out.println("Before sorting");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(cars));
        
        System.out.println("Position " + Arrays.binarySearch(cars, "Ford"));
        int num = Arrays.binarySearch(cars, "Ford");
        System.out.println("Position " + Arrays.binarySearch(cars, "Ford"));
     
	
	}		
			
	

	
	
	
	
	
	
	}
}
