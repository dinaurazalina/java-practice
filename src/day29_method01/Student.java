package day29_method01;

public class Student {
	public static void main(String[] args) {
		SayHello();
		study();
		eating();
		study();
		code();
		
	}
	
	public static void study() {
		System.out.println("Student is studying");
	}
	public static void eating() {
		System.out.println("Student is eating");
	}

	//create a method with name SayHello. that prints "Hello Friends!!"

	public static void SayHello() {
		System.out.println("Hello Friends!!");
		System.out.println("How are you today? ");
	}



	//create a method code with name code "Student is coding Java"
	
	public static void code() {
		System.out.println("Inside Code method");
		System.out.println("Student is coding Java");
	}


}
