package day23_loopsArrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		int [] numbers =new int [3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		//assign to the first variable of num1
		numbers [0] = num1;
		numbers [1] = num2;
		numbers [2] = num3;
	// we cannot provide different data type, we have to use data of arrays
	
	// number.length   - property , thats why we print it without ()
	for (int i  = 0; i < numbers.length; i++) {
		System.out.println(numbers [i]);
	}
	
	
	byte [] bytesArrays = new byte[Integer.MAX_VALUE-2];
	
	
	
	}
}
