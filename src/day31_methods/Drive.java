package day31_methods;

public class Drive {
public static void main(String[] args) {
	drive("Audi", 80);
	drive("Subaru", 40);
}
//this method will print out car with args from the main method
//the type and the order MUST match!!
public static void drive(String car, int speed) {
	System.out.println(car + " is driving " + speed + " mph");
} 
}
