package LeetCode;
import java.util.*;
import java.util.Scanner;

public class RomantoIntV3 {

	public static void main(String[] args) {
		
		String roman[]= {"I", "V",  "X", "L", "C", "D",  "M"};
		int ints[] =  { 1,   5,   10,  50,  100, 500, 1000};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a roman number");
		String s = scan.next();
		
		String arr[] = s.split("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].equals(roman[j])) {
					
				}
			}
			}
			
	}
}
