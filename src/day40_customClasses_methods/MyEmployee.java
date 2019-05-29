package day40_customClasses_methods;

public class MyEmployee {

	public static void main(String[] args) {
		
		Employee dina = new Employee();
		dina.name = "Dina";
		dina.jobTitle = "SDET";
		dina.salary = 85000;
		
		dina.attendMeeting();
		dina.work();
		dina.goToBreak();
		dina.introduce();
	}
}
