package day08_casting_conditionals;

public class explicitCasting {

	public static void main(String[] args) {
		
		System.out.println(10 /2.0);// result is double because double always wins
		System.out.println(10.0 /2);
		
		//int result = 10/2.0; //will not compile, you need to cast it first
	
		
		int result = (int)(10/2.0);
		
		
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (rent1+ rent2+ rent3+rent4)/4;//it calculates first, then assign to double
		
		System.out.println(average);
	
	
		double average1 = (rent1+ rent2+ rent3+rent4)/4.0;
		System.out.println(average1);
		
		double average2 = (double)(rent1+ rent2+ rent3+rent4)/4;
		System.out.println(average2);
	
	
	
	
	
		double d= 40.3;
		int i = (byte)d;
		// in this statement both explicit and explicit casting happening
		
		//explicit: double > byte;
		//implicit: byte > int;
	
		
		System.out.println();
	
		
		System.out.println();
		System.out.println('a' + 1);
		
		System.out.println();
		char letter = 98;
		System.out.println(letter);
		
		
	}
}
