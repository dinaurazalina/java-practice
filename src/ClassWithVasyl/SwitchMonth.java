package ClassWithVasyl;
import java.util.*;
public class SwitchMonth {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int month = scan.nextInt();
	String message = "";
	switch(month) {
		case 1: case 2: case 12:
			message = "Winter";
		break;
		case 3: case 4: case 5:
			message = "Spring";
		break;
		case 6: case 7: case 8:
			message = "Winter";
		break;
		case 9: case 10: case 11:
			message = "Fall";
		break;
		default:
			message = "Invalid number";
		}
	
	System.out.println(message);
}
}
