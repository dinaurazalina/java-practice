package OfficeHourswithMurodil6to7;

public class milesToKm {

	public static void main(String[] args) {
		double km = milesToKms(55);
				System.out.println(km);
				System.out.println(multiply(4, 8));
		
				
		double gallons = gallonToLitters(15);
System.out.println("10 gallons is " + gallons + " litters");
	}
	
	public static double milesToKms (double miles) {
		//double kmValue  = miles *1.609;
		double kmValue = multiply(miles, 1.609);
		return kmValue;
	}
	
	
	public static double multiply(double num1, double num2) {
		return num1*num2;
	}
	
	public static double gallonToLitters(double gallons) {
		//local variable is the variable inside the method
		double liters = multiply(gallons, 3.785);
		return liters;
	}
	
}
