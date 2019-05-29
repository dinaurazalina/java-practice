package OfficeHourswithMurodil6to7;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.firstName = "Pavel";
		emp1.lastName = "Babayan";
		//instance methods 
		emp1.printInfo();
		
		Employee emp2 = new Employee();
		emp2.firstName = "Dina";
		emp2.lastName = "Urazalina";
		emp1.generateEmail();
		emp1.printEmail();
		emp1.setEmail("3444");
		//Employee[] it_department = new Employee[2];
		//Employee [] it_department = {emp1, emp2};
		
		emp1.title = "Developer";
		emp1.setJobTitle("cashier");
		emp1.printInfo();
	
	}
}
