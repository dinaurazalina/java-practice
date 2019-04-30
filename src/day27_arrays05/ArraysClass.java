package day27_arrays05;
import java.util.*;
public class ArraysClass {
public static void main(String[] args) {
	int [] num = {43, 12, 4, 1, 3, 5};
	
	//toString method
	System.out.println(Arrays.toString(num));

	String str =Arrays.toString(num);
	System.out.println(str);
	
	//sort method
	Arrays.sort(num);
	
	System.out.println(Arrays.toString(num));



	String [] language = {"Zulu", "Polish","Italian", "Spanish", "Arabic", "French"};
	Arrays.sort(language);

	System.out.println(Arrays.toString(language));

	
	System.out.println("* * * * * * * *");
	
	System.out.println("	* * * * * * * *");

	System.out.println("* * * * * * * *");
	

	
	int [] nums2 = {433, 122, 423, 124545, 354, 5};

	//find lowest and largest values from num2 arrays
	System.out.println("Your array is: " + Arrays.toString(nums2));
	Arrays.sort(nums2);
	
	System.out.println("Lowest number: " + nums2[0]);
	System.out.println("Largest number: " + nums2[nums2.length-1]);
	




}

}
