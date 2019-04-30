package day28_multiDArrays;

import java.util.Arrays;

public class multiDArray {

	public static void main(String[] args) {
		
		int [][] value = new int [4][];//if you dont know how many values you wanna store
		
		value [0] = new int [] {43, 25, 65};
		
		value [1] = new int [] {43, 325, 635, 2435 ,54 ,45 ,4, 23, 32, 34, 45, 3, 34 };
		
		
		value [2] = new int[2];
		value [2][0] = 55;
		value [2][1] = 88;
		
		
		value [3] = new int[] {5, 12, 34, 6, 23};
	
		System.out.println(Arrays.deepToString(value));
	}
}
