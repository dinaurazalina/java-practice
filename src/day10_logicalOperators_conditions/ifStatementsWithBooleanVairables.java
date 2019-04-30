package day10_logicalOperators_conditions;

public class ifStatementsWithBooleanVairables {
	
	public static void main(String[] args) {
	
		boolean isBreakTime = true;
		
		if(isBreakTime == false) {
			
			System.out.println("Break till 8:35");
		}else {
			System.out.println("Not Break time yet");
		}
		
		//second version

		if(isBreakTime) {
			
			System.out.println("Break till 8:35");
		}else {
			System.out.println("Not Break time yet");
		}
		
	
		boolean classTime = false;
		
		if(classTime == true) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay attention");
			System.out.println("Code and have fun");
		}else {
			System.out.println("Take a walk and have some water");
		}
		
		
		
		boolean qualified = false;
		//send a notification message only if NOT qualified 
		//we need to check if qualified variable contains FALSE
		
		if(qualified ==false) {
			System.out.println("Y	our application was not approved. Thank you");
		
		}
		//the same meaning
		if(qualified) {
			
		}else {
			System.out.println("Your application was not approved. Thank you");
			}
		
		
		
	}
	
}
