package ClassWithVasyl;
import java.util.*;
public class IfStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int age = scan.nextInt();
		if(age > 0 && age  <21) {
			System.out.println("Underage");
		}else if(age < 1) {
			System.out.println("Invalid age");
		}else {
			System.out.println("You are fine");
		}
	
	
		

	}
}
