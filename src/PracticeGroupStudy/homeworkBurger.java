package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkBurger {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

	
	
	
	
	
	int num, digit1, digit2, digit3, digit4, digit5;
	
	System.out.println("Enter you number:");
	
	num = s.nextInt();
	
	digit1 = num/10000;
	System.out.println(digit1);
	
	digit2 = num%10000/1000;
	System.out.println(digit2);
	
	digit3 = num%10000%1000/100;
	System.out.println(digit3);
	
	digit4 = num%10000%1000%100/10;
	System.out.println(digit4);
	
	digit5 = num%10000%1000%100%10/1;
	System.out.println(digit5);
	
	}
}
