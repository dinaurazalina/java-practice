package day40_customClasses_methods;
import java.util.*;
public class WarmUpList {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("tomato");
		str.add("avocado");
		str.add("peppers");
		str.add("tomato");
		str.add("tomato");
		str.add("tomato");
		str.add("olive oil");
		
		String targetWord = "tomato";
		int count = countOccurences(str, targetWord);
		if(count == 3) {
			System.out.println("Unit Test pass: Count is three");
		}else {
			System.out.println("Unit test FAILED: Count is "+ count );
			System.out.println("		  Expected: 3");
			System.out.println("		  Actual: " + count);
		}
		
	}
	
	public static int countOccurences(ArrayList<String> arrString, String word) {
		int count = 0;
		for(String a: arrString) {
			if(a.equals(word)) {
				count++;
			}
		}
	return count;
	}
}
