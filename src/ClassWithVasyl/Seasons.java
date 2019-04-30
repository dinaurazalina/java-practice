package ClassWithVasyl;
import java.util.*;
public class Seasons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//please write a program that will  print season name
		//based on the int value
		//value will be provided through the scanner 
		// 1 
		//winter
		//6
		//Summer
		
		System.out.println("Enter the number of the month:");
		int month = scan.nextInt();
		
		
		if(month >=1 && month <=2 || month ==12) {
			System.out.println("Winter");
		}else if(month >=3 && month <=5) {
			System.out.println("Spring");
		}else if(month >=6 && month <=8) {
			System.out.println("Summer");
		}else if(month >=9 && month <=11) {
			System.out.println("Fall");	
		}else {
			System.out.println("Invalid Data");
		}
			
			
	}
}
