package day05_math_operators;

public class Remainder {

	public static void main(String[] args) {
		 
		int num1 = 3;
		int num2 = 1;
		int total = (num1 + num2);
		System.out.println(total);
		
		num1 +=num2;
		System.out.println(num1);
		
		
		
		
		num1 *=10;
		System.out.println(num1);
		 num1 %=70;
		 System.out.println(num1);
		
		 num1 = 10;
		 int num3 = 50;
		 System.out.println(num1 * num1);
		 
		 int sum = num1 + num2 + num3;
		 int sub = num1 - num2 - num3;
		 int mult = num1 * num2 * num3;
		 int dev = num1/ num2/ num3;
		 
		 
		 System.out.println(sum + ", " + sub +", "+ mult +", " +  dev);
	
	
	}
}
