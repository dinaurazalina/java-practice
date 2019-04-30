package day27_arrays05;
import java.util.*;
public class JavaTools {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the tool: ");
	String [] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};


	/**
	 * Java > programming language
Selenium > Test automation
TestNG > Unit Testing
JUnit > Unit Testing
Cucumber > BBD Style testing
Git > Version control
Maven > Building and execution for project 
	 */

	

for(String tool : tools) {
	switch(tool.toLowerCase()) {
	case "java":
		System.out.println("Java > programming language");
		break;
	case "selenium":
		System.out.println("Selenium > Test automation");
		break;
	case "testng":
	case "junit":
		System.out.println("Unit Testing");
		break;
	case "cucumber":
		System.out.println("BBD Style testing");
		break;
	case "git":
		System.out.println("Version control");
		break;
	case "maven":
		System.out.println("Building and execution for project");
		break;
	default:
		System.out.println("Invalid input");
	}
}




}
}
