package day33_methodsWithReturnValue;

public class Multiply {
public static void main(String[] args) {
	double result = multiply(34, 9);
	System.out.println("Result: "+ result);

double result2 = divide(43, 39);
System.out.println("Result: "+ result2);

double result3 = minus(34, 9);
System.out.println("Result: "+ result3);
}

public static double multiply(double num1, double num2) {
	double result = num1*num2;
	return result;
}
public static double minus (double num1, double num2) {
	double result = num1- num2;
	return result; 
}

public static double divide (double num1, double num2) {
	double result =0;
	if(num2 !=0) {
		result=  num1/num2;
	
	}return result;
	//or  
	/* 
	 * if(num2==0){
	 * System.out.print("Error: cannot divide by 0")};
	 * System.exit(0);//stop the whole code
	 * }else{
	 * double result = num1/num2;
	 * return result;
	 * }
	 * }
	 */
	
	}
}
