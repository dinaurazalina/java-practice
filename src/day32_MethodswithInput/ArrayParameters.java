package day32_MethodswithInput;
import java.util.*;
public class ArrayParameters {


	public static void main(String[] args) {
		int[] myArray = {44, 22, 66, 11};
		printArray(myArray);
		System.out.println();
		printArray(new int [] {34, 234, 65 ,3433, 5, 212111, 6});
		System.out.println();
		int [] myNums = new int [] {3, 5, 7, 64, 2, 4, 23, 12, 33, 43, 3, 43, 4}; 
		printArray(myNums);
		System.out.println();
		printArray(new int [9]);
		
		System.out.println();
		System.out.println();
		
		int [] arr1 = {2, 35, 6, 4, 3, 7};
		int [] arr2 = {5, 6, 3};
		print2Arrays(arr1, arr2);
		print2ArraysV2(arr1, arr2);
		
	}
	
	
	
	/* Method: printArray
	 * return type: void
	 * param : int []nums
	 * prints values of the nums array
	 * 
	 */
	
	public static void printArray(int [] nums) {
		for(int n: nums) {
			System.out.print(n+ " ");
		}
	}
	
	
	
	/*Method name : print2Arrays
	 * return type: void
	 * params: 2 int arrays
	 * it prints the larger array followed by smaller array
	 * 
	 */
	public static void print2Arrays (int [] arr1, int [] arr2) { //signature 
		
		if(arr1.length > arr2.length) {
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
		}else {
			System.out.println(Arrays.toString(arr2));
			System.out.println(Arrays.toString(arr1));
		}
	}
	//version 2 we will call printArrays method
public static void print2ArraysV2(int [] arr1, int [] arr2) { //signature 
	
	if(arr1.length > arr2.length) {	
		printArray(arr1);
		printArray(arr2);
	}else {
		printArray(arr2);
		printArray(arr1);
	}
	
}
}
