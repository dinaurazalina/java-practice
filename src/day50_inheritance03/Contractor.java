package day50_inheritance03;

public class Contractor extends Employee{
	@Override
	public void calculatePay(int hours, double rate) {
		
		System.out.println("Employee total pay : "+ ((hours*rate)+200));
	}
}
