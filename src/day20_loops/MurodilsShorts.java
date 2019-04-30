package day20_loops;
import java.util.Scanner;
public class MurodilsShorts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//count only even numbers
		int num, count;
		num = 0;
		System.out.println("enter the number");
		count = scan.nextInt();
		while(count > num) {
			System.out.println(num);
			num+=2;
		}
		
		System.out.println();
		
		
		//calculator 
		System.out.println("Enter the number for calculator");
		int num1 = scan.nextInt();
		
		for(int i = 0; i <=10; i++) {
			System.out.println(num1 + " x " + i +" = " + num1*i);
		}
		
		
		
		//sum for even numbers
		System.out.println("enter the number for summary of even nums");
		int num3 = 0;
		int count3 = scan.nextInt();
		int sum = 0;
		while(count3 > num3) {
			num3+=2;
			sum +=num3 ;
			
			
		}
		System.out.println(sum);
	}
}
