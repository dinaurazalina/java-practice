package day34_methods;

import java.util.Arrays;

public class CountArray {

	public static void main(String[] args) {
		int [] arr = {4, 5 ,4, 4, 67, 23, 7654, 23, 1, 4, 4, 397, 4};
		int num = 4;
		System.out.print("There are ");
		System.out.println(findOccurences(arr, num) + " occurences of value " + num +" in array "+ Arrays.toString(arr));
		
		//2. assign return value into a variable
		int four = findOccurences(arr, num);
		System.out.println("There are " + four + " occurences of 4 in the array");
	
		if(four>0) {
			System.out.println("We have four ");
		}else {
			System.out.println("No fours");
		}
	
		
		//create array and pass to method 
		
		int twentythree = findOccurences (new int[] {12, 34, 65,23, 23, 32 , 232, 32,23}, 23);
	System.out.println("New array, we are looking for 23 : "+ twentythree);
	
	
	}
	
	//this method return how many num are in the array arr
	public static int findOccurences (int [] array, int value) {
		int count = 0;
		for(int num :array){
			if(num == value) {
				count++;
			}
		}
		
		
		return count;
	}
}
