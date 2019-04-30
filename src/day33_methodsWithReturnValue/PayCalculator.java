package day33_methodsWithReturnValue;

public class PayCalculator {

	public static void main(String[] args) {
		System.out.print("Total pay for 40 hours: ");
		System.out.println(getHourlyPay(40, 52));
		int NoPay = (int) getHourlyPay(10, 0);
		System.out.println("No pay "+NoPay );
		
	}
	
	public static double getHourlyPay(int hours, double rate ) {
		
		if(hours <=0) {
			System.out.println("Invalid hours");
			return 0;
		}
		if(rate <=0) {
			System.out.println("Invalid rate");
			return 0;
		}
		
		double wage = Multiply.multiply(hours, rate);
		return wage;
	//System.out.println("End of methods"); the code is unreachable bc it is after return statement
	}
}
