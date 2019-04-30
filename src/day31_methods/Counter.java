package day31_methods;
import java.util.*;
public class Counter {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();

	
	countUp(count);
	System.out.println();
	countDown(count);
}
//countUp will print from 1 to the value of the program
	public static void countUp(int count) {

	System.out.println("Enter the number to count up");
		if(count < 1) {
			System.out.println("Invalid number");
		}else {
		int num = 1;
		while(num<=count) {
			System.out.print(num + " ");
			num++;
		}
		}
	
}
	//countDown will count down to 1
	public static void countDown(int count) {
		System.out.println("Enter the number to count down");
		int numD = 0;
		while(numD<count) {
			System.out.print(count - numD +" ");
			numD++;
		}
		
		//for(int n = count; n >=1; n--){
		//  System.out.print(n + " "); 
		// }
	
	}
}
