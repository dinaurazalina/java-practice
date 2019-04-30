package OfficeHourswithMurodil6to7;

import java.util.Arrays;

public class NumberswithVasyl {

	public static void main(String[] args) {
		
		int [] numbers = {421, 235, 435, 64, 547, 63, 54, 845, 4};
		double [] doubleNumbers = {421.235, 435.64, 547.63, 54.845, 4};
		findMin(numbers);
	
		System.out.println("The minimum value of " + Arrays.toString(numbers) + " array is " + findMin(numbers));

		int m = findMin(numbers);
		double m2 = findMin(doubleNumbers);
		System.out.println(m);
		System.out.println(m2);
	}
	
	
	
	public static int findMin(int [] arr) {
		int min = arr[0];
		
		for(int i : arr) {
			if(i< min) {
				min  = i;
			}
		}
		
		return min;
	}



//overloading = is when you create same array with the same params
	public static double findMin(double [] arr) {
		double min = arr[0];
		
		for(double i : arr) {
			if(i< min) {
				min  = i;
			}
		}
		
		return min;
	}
	}
