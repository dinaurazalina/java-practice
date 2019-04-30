package day27_arrays05;
import java.util.*;
public class CopyOf2 {

	public static void main(String[] args) {
		
		int[] num1 = {34, 56, 23, 1, 55};
		
		int [] num2 = Arrays.copyOf(num1, num1.length +2); //when you want to add more spots to your array
		
		int [] num3= Arrays.copyOfRange(num1, 1, 3);
		System.out.println(Arrays.toString(num2));
		
		System.out.println("Num3: "+Arrays.toString(num3));
		
		
		int [] brandNew = {34, 23, 45 ,67};
		System.out.println("Length before: "+brandNew.length);
		
		brandNew = Arrays.copyOf(brandNew, brandNew.length+ 5);
	
		System.out.println("Length after: "+brandNew.length);
	
	
	
	}
}
