package day20_loops;

public class EvenOrOdd {
public static void main(String[] args) {
	
	//using for loop: 1 - 100
	//1 print all even  in the same line
	//2 print all even  in the same line
	//3 print SumOfEven sumOfOdd - calculate them
	//and print them 
	
	System.out.println("Even: ");
	for (int i = 1; i <=100; i++) {
		if (i%2 == 0) {
			
			System.out.print( i + " ");
		}	
	}
	System.out.println();
	System.out.println("Odd");
	for (int i = 1; i <=100; i++) {
		if (i%2 == 1) {
			System.out.print( i + " ");
		}
	}
	
	System.out.println();
	System.out.println();

	
	int sumOfEven = 0;
	int sumOfOdd = 0;
	
	for(int i = 1;i <=100; i++) {
		if(i%2 == 0) {
			sumOfEven +=i;
	}else { 
		sumOfOdd +=i;
	}
	}
System.out.println("Sum of even : " + sumOfEven);
System.out.println("Sum of odds : " + sumOfOdd);
}
}
