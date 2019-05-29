package LeetCode;
import java.util.*;
public class RomanToIntegerV2 {
public static void main(String[] args) {
	
	char roman[]= {'I', 'V',  'X', 'L', 'C', 'D',  'M'};
	int ints[] =  { 1,   5,   10,  50,  100, 500, 1000};
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a roman number");
	String s = scan.next();
	
	int result =0 ;
	//MCMXCIV


	int var = 0;
	for(int k =1; k < s.length(); k++) {
	for (int i = 0; i < roman.length; i++) {
		
		if(s.charAt(k) == roman[i]) {
			var = i;
		}
	}
	//1000			//100
	if(ints[k] > ints[k-1]) {
		result += ints[k]-ints[k-1];
	}else {
		result+=ints[k];
	}
	
	
	}
	result+= ;
System.out.println(result);
}
}
