package day52_inheritance;

public class FinalMethod {

	public final void method1 () {
		System.out.println("Final method1");
	}
	
	public final static void staticMethod(String word) {
		System.out.println("Static word:" + word);
	}
	
	class Sub extends FinalMethod{
		//the method cannot be overriden since it is a final method
//		public void method1() {
//			System.out.println("Overridded method 1");
//		}
		
		//but you can overload the method from super class because java will look at it as a different method.
		public void method1(String word1) {
			System.out.println("Overloading method1");
		}
		
		
		
	}
	public static void main(String[] args) {
		
		
	}
}
