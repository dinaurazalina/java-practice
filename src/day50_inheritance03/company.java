package day50_inheritance03;

public class company extends Employee{

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FullTimeEmployee fullTemp = new FullTimeEmployee();
		Contractor cont = new Contractor();
		emp.calculatePay(40, 50);
		fullTemp.calculatePay(40, 50);
		cont.calculatePay(40, 50);
	}
}
