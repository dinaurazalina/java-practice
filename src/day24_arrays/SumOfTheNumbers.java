package day24_arrays;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		
		/*lets create an array of integers with length 3
		 * 
		 */
		
		
		int [] numbers = new int [3];
		//first value in array
		numbers [0] = 5;
		//second value in array
		numbers [1] = 10;
		//third value in array
		numbers [2] = 20;
		
	//[I@4d591d15 this is a hash code
		System.out.println(numbers);
		//to String() from arrays class can help as to print as string 
		
		System.out.println(Arrays.toString(numbers));
		
		int sum = 0;
		
		//in case of array string.length is not a method, it is a property! It cannot be changed
		for (int i = 0; i <numbers.length; i++) {
			sum += numbers[i];
		}System.out.println("The summary of values of elements in the array Numbers: "+sum);
		
		
		
		
		//find the largest value in the array
		
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max value "+ max);
		
		
		//find the minimum value in the array
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]< min) {
				min = numbers[i];
				
			}
		}
		System.out.println("Minimum value "+ min);
		
		
		
	}
}
