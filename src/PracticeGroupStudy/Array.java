package PracticeGroupStudy;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		String element = "apple";
		String [] arr= {"bla", "apple", "fs", "la", "croix", "apple", "bla"};
		System.out.println(Arrays.toString(arrayWithoutElement(arr, element)));
	}
	public static String [] arrayWithoutElement (String []arr, String element) {
		
		int elCounto =0;
		for(String a:arr) {
			if(a.equals(element)) {
				elCounto++;
			}
			}
			String [] arrayWithoutElement = new String [arr.length - elCounto];
			 for(int i =0; i < arr.length;i++) {
				for (int j = 0; j < arrayWithoutElement.length; j++) {
					if(arr[i].equals(element)) {
						arrayWithoutElement[i] = arr[j+1];
					}
				}
			 }
		return arrayWithoutElement;
	}
}
