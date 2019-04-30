package day35_review;
import java.util.*;
public class UniqueArray {
//common interview question: to print unique numbers
	public static void main(String[] args) {
		
		int nums [] = { 4, 23, 23};
		System.out.println("The unique numbers in the array "+Arrays.toString(nums)+" are: ");
		uniqueNumber(nums);
		System.out.println("******************************");
		
		int array []= {56, 12, 12} ;
		System.out.println("The unique numbers in the array" + Arrays.toString(array) +" are");
		uniqueNumber(array);
		System.out.println("******************************");
		
		int array2 [] = {3, 6, 4, 3, 3, 3, 5, 6, 6, 5, 4};
		//System.out.println(Arrays.toString(getUniqueArray (array2)));
		System.out.println("******************************");
		System.out.println("******************************");
		int [] cheapUni = getUniqueArrayCheapV2(array2);
		System.out.println(Arrays.toString(cheapUni));
		
	}
	public static void uniqueNumber(int []arr) {

		
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]== arr[j]) {
					counter++;
				}
			}
			if(counter ==1) {
				System.out.println(arr[i]);
			}counter =0;
		}
	}
	
	
	//find out how many unique numbers
	
	//return the array
	public static int [] getUniqueArray(int [] nums) {
		//find out how many unique numbers
				int uniqueCount = 0;
				for(int i = 0; i < nums.length; i++) {//outer loop 
					
					int temp = nums[i]; // get a number
					int counter = 0;
					//
					for(int j = 0; j < nums.length; j++) {//inner/nested loop
						if(nums[j] == temp && i != j) {
							counter++;
							break;
						}
					}
					//
					if(counter == 0) {//is it still 0. then it is unique
						uniqueCount++;
					}	
				}
				//declare new array with that size
				int[] uniqueArray = new int[uniqueCount];
				int idx = 0;
				//and loop through again and assign unique numbers
				for(int i = 0; i < nums.length; i++) {//outer loop 
					
					int temp = nums[i]; // get a number
					int counter = 0;
					//
					for(int j = 0; j < nums.length; j++) {//inner/nested loop
						if(nums[j] == temp && i != j) {
							counter++;
							break;
						}
					}
					//
					if(counter == 0) {//is it still 0. then it is unique
						uniqueArray[idx] = temp;
						idx++;
					}	
				}
				
				//return the array
				return uniqueArray;
}
	//declare empty string 
	public static int[] getUniqueArrayCheapV2(int [] nums) {
		String unique = "";
		//find unique numbers and add to that string 
		for(int i = 0; i < nums.length; i++) {//outer loop 
			
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {//inner/nested loop
				if(nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {//is it still 0. then it is unique
				unique+=temp + " ";
			}	
		
		}	//split that string by space
		String [] strArr = unique.trim().split(" ");
		//declare new int[] and assign each number from string 
		int[] uniqueArr = new int [strArr.length];
		for(int k = 0; k< strArr.length; k++) {
			uniqueArr[k]= Integer.parseInt(strArr[k]);
		}
		//return the int [] array
		return uniqueArr;
	}
	
	
	}
