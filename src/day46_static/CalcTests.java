package day46_static;

public class CalcTests {

	public static void main(String[] args) {
		
		double result = Calculator.plus(55, 7);
		System.out.println("result: " + result);
	
		result = Calculator.minus(44, 14);
		System.out.println("result: "+ result);
		
		Calculator c = new Calculator();
		System.out.println(c.multiply(4, 2));
		
		int i =Integer.parseInt("44");
		System.out.println(Character.isDigit('5'));
		System.out.println("hi");
	}
}
