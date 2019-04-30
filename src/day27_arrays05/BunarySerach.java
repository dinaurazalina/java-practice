package day27_arrays05;

import java.util.Arrays;

public class BunarySerach {

	public static void main(String[] args) {
		
		//BinarySearch
		
		
		int [] nums3 = {3,5,6,7,2,5,45,4523,65,34,1};
		
		Arrays.sort(nums3);
		System.out.println("Index of number 45 is "+Arrays.binarySearch(nums3, 45));
		System.out.println("Index of number 21 is "+Arrays.binarySearch(nums3, 1));
		System.out.println("Index of number 65 is "+Arrays.binarySearch(nums3, 65));
		System.out.println("Index of numberc 1 is "+Arrays.binarySearch(nums3, -1));
	
	int i = Arrays.binarySearch(nums3, 5);
	System.out.println(i);
	
	
	
	
	int [] nums4 = {3,5,64, 40,65, 3,65,34,1};
	System.out.println(Arrays.binarySearch(nums4, 65));
	
	}
}
