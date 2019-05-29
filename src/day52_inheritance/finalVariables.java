package day52_inheritance;

public class finalVariables {

	final int ROADSTER_MAX_RANGE= 610; //INTIALIZE RIGHT AWAY OR
	public final int MODEL_3_MAX_SPEED;//ASSIGN IN CONSTRUCTOR
	public final int MODEL_X_PASSENGER; // ASSIGN IN INIT BLOCK
	public static final String COMPANY_NAME = "Cybertek";
	public static final String USER_NAME;
	
	static {
		USER_NAME = "admin1";
	}
	
	public finalVariables() {
		MODEL_3_MAX_SPEED = 180 ;
	}
	
	/*
	 * public finalVariables(int num) {
		MODEL_3_MAX_SPEED = num ;
		}
	
	 */
	{
		MODEL_X_PASSENGER = 7;
	}
	
	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT = 5; //according to the convention you should name final variable all UPPERCASE w underscore 
		// MAX_PASSENGERS_COUNT = 51; once the variable is final, you cannot modify it. 
		
		final double PI = 3.141592;
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN; //for local variables you can declare the variable first without 
		SSN = 342343322;
		finalVariables finVars = new finalVariables();
		System.out.println("Max passanger for roadster: "+ finVars.MODEL_X_PASSENGER);
		
		System.out.println("Max speed for roadster: "+ finVars.MODEL_3_MAX_SPEED);
		
		System.out.println("Max range for roadster: "+ finVars.ROADSTER_MAX_RANGE);
		
		System.out.println("Company name: " + COMPANY_NAME);
	}
}
