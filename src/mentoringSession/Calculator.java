package mentoringSession;
import java.util.*;
public class Calculator {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	String operator = "";
	
	System.out.println("num1: ");
	double num1 = scan.nextDouble();
	
	System.out.println("num2: ");
	double num2 = scan.nextDouble();
	double result = 0;
	while(true) {
	System.out.println("choose your operator: ");
	operator = scan.next();
	if(operator.equals("c")) {
		break;
	}
	
	switch(operator) {
	case "+": 
		result = num1 + num2;
		break;
		
	case "-": 
		result = num1 - num2;
		break;
		
	case "*": 
		result = num1 * num2;
		break;
		
	case "/": 
		result = num1 / num2;
		break;
		
	case "%": 
		result = num1 % num2;
		break;
	
	}
	System.out.println(result);
	num1 = result;
	}
}
}
