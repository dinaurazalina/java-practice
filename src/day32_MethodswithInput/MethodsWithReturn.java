package day32_MethodswithInput;

public class MethodsWithReturn {

	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println(i);
		System.out.println(giveMeYourName());
		String myName = giveMeYourName();
		System.out.println("My name is " + myName);
	}
	
	/*
	 * this method returns int value.
	 */
	public static int giveMe10$() { //only can return one variable type
		System.out.println("Returning 10 from method");
		return 10; 
	}
	
	/*
	 * giveMeYourName()
	 * return type: String
	 * Declare name variable and assign your name
	 * then return it and call it in main method
	 * 
	 */
	public static String giveMeYourName() {
		
		System.out.println("Give me your name:");
		
		return "DinaBabe";
	}




}


