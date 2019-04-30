package PracticeGroupStudy;
import java.util.Scanner;
public class practice2 {
	
	public static void main(String[] args) {
		Scanner practiceDemo = new Scanner(System.in);
		
		System.out.println("Enter your name, age, and salary");
		
		String name = practiceDemo.next();
		int age = practiceDemo.nextInt();
		double salary = practiceDemo.nextDouble();
		
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Salary:" + salary);
	
	}
}
