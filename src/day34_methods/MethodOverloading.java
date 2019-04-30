package day34_methods;

import java.util.Arrays;

public class MethodOverloading {

	public static void main(String[] args) {
		
		add(202, 10);// for int
		add(23.4, 4); //double
		add("Pooh", "Chi");// string
	}
	public static void add(int num1, int num2) { //same names, different parameters
		int result = num1 +num2;
		System.out.println("Result: "+ result);
	}
	public static void add(double num1, double num2) { //method overloading
		double result = num1 + num2;
		System.out.println("Result: "+ result);
	}
	public static void add(String str1, String str2) { //method overloading
		String result = str1 + str2;
		System.out.println("Result: "+ result);
		
	}
}
