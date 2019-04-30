package day33_methodsWithReturnValue;

public class AgeCalculator {

	public static void main(String[] args) {
		int age = calculateAge(1994);
		System.out.println("My age is "+ age+ " years old");
	}
	
	/*
	 * method is calculating the age
	 * 
	 */
	public static int calculateAge(int year) {
		int currentAge = 2050;
		year =currentAge-year;  
		if(year>=0 && year <=14) {
			System.out.println("child");
		}else if(year >=15 && year <=25) {
			System.out.println("youngster");
		}else if(year >= 26 && year <=64) {
			System.out.println("adult");
		}else if(year >=65) {
			System.out.println("Senior");
		}else {
			System.out.println("Invalid Age");
			return 0;
		}
		return year ;
	}
}
