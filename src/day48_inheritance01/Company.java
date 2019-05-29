package day48_inheritance01;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Marufjon";
		emp1.jobTitle = "teacher";
		emp1.gender = 'm';
		emp1.age = 22;
		
		Employee emp2  = new Employee();
		emp2.name = "Keke";
		emp2.age = 26;
		emp2.gender = 'f';
		emp2.jobTitle = "HR";
	
		
		
		emp1.work();
		emp2.work();
		emp1.eat("chicken quesadilla");
		emp2.eat("salad");
		
		emp2.walk();
		emp1.walk();
		
		emp1.sleep(5);
		emp2.sleep(10);
		
		System.out.println(emp2.toString());
	}
	
}
