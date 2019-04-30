package day33_methodsWithReturnValue;

public class WarmUpAddValue {
public static void main(String... args) {
	addMethod(4, 6);
	int result = add(9, 10);
	System.out.println("Result: "+ result);
	
}




public static void addMethod (int num1, int num2) {//it will run 2 steps, but it doesnt return any value, you cannot store the result either
	int sum = num1 + num2;
	System.out.println("Sum "+ sum);
}


public static int add(int num1, int num2) {
	int sum = num1+ num2;
	return sum;
}
}
