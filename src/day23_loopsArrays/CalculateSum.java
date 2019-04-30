package day23_loopsArrays;
import java.util.Scanner;
public class CalculateSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	//write a program that will calculate a sum of 6 numbers
		//if number is less or equals to  0, ignore this number
		
		
		int sum = 0;
		int num = 0;
		
		for(int i = 0; i<6 ; i++) {
			System.out.println("Provide a number: ");
			 num = scan.nextInt();
			if(num <=0) {
				continue;
			}
			sum +=num;
		}
		
		
		System.out.println("Your summary: "+sum);
		String str = "";
		char missing = str.charAt(n); 
		String missingChar = str.replace(missing + "", "");
		
		
		
		
		
		
		
		
	}
}
