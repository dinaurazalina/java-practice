package day05_math_operators;

public class DecrementIncrement {

	public static void main(String[] args) {
	
		//Increment 
		
		
		int x = 20;
		++x;
		System.out.println(x);
		
		int age = 24;
		int previousYear = 2018;
		System.out.println("I turned " + age + " in " + previousYear);
		
		++age;
		++previousYear;
		
		System.out.println("Now, it's " + previousYear + " and I'm turing " + age);
		
		//Decrement
		
		int y = 18;
		--y;
		System.out.println(y);
		
		System.out.println("I finished my high school when I was " + y);
		
		--y;
		previousYear = previousYear - 10; 
		
		System.out.println("Two years ago, when I just turned " + y + " I changed my high school, as far as I remember it was " + previousYear);
		
	}
}
