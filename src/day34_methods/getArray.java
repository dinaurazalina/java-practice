package day34_methods;

import java.util.Arrays;
import java.util.Random;

public class getArray {

	public static void main(String[] args) {
		
		int arr2 [] = getArray();
		System.out.println(Arrays.toString(arr2));
	
	
		int ranArray [] = getRandomArray(5);
		System.out.print("Array of random numbers: ");
		System.out.println(Arrays.toString(ranArray));
	}
	
	public static int [] getArray (){
		int [] arr = {56, 34, 2, 4, 0};
		return arr;
	
	}
	
	
	//arrays with random
	public static int [] getRandomArray (int size) {
		Random rand = new Random();
		
		int [] array = new int [size];
		for(int i = 0; i < size; i++) {
			array[i] = rand.nextInt(101);
			
		}
		
		return array;
	}
}
 