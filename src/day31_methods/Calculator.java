package day31_methods;
import java.util.*;
public class Calculator {
public static void main(String[] args) {
//	add(3, 6);
//	subtract(45, 43);
//	multiply(5, 8);
//	divide(6, 0);
//	remainder(7,3);
	
	//using Scanner pass 2 nums and operators
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers:");
	double num1 = scan.nextDouble();
	double num2 = scan.nextDouble();
	System.out.println("Select operation: '+', '-', '*', '/',  '%'");

	String operator = scan.next();
	switch(operator) {
	case"+":
		add(num1, num2);
		break;
	case "-":
		subtract(num1, num2);
		break;
	case "*":
		multiply(num1, num2);
		break;
	case "/":
		divide(num1, num2);
		break;
	case "%":
		remainder(num1, num2);
		break;
		default: 
			System.out.println("Invalid operator");
		
	}


}

public static void add(double n1, double n2) {
	double result = n1 + n2;
	System.out.println("Result: " + result);
}
public static void subtract(double n1, double n2) {
	double result = 0;
	if(n1> n2) {
	 result = n1 - n2;
	}else {
	 result = n2 - n1;
	}
	System.out.println("Result: " + result);
}
public static void multiply(double n1, double n2) {
	double result = n1 * n2;
	System.out.println("Result: " + result);
}
public static void divide(double n1, double n2) {
	if(n2==0) {
		System.out.println("cannot / by zero");
		return;// exit the method here. do not run the rest
	}
	
	double result = n1 / n2;
	System.out.println("Result: " + result);
	
}
public static void remainder(double n1, double n2) {
	double result = n1%n2;
	System.out.println("Result: " + result);
}
}