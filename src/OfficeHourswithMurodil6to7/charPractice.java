package OfficeHourswithMurodil6to7;

import java.util.Arrays;

public class charPractice {

	public static void main(String[] args) {
		
		String phoneNumber = "(240) 547 4890";
	
		//toCharArrar() it will convert any string into array of chars
	
		char[] chars = phoneNumber.toCharArray();
		System.out.println(Arrays.toString(chars));
		
		int digitCounter = 0;
		
		//isDigit() method returns true, if given char is digit
		
		for(char value : chars) {
			if(Character.isDigit(value)) {
				digitCounter++;
			}
		}
		System.out.println("Number of digits: "+ digitCounter);
		String name = "Mi6ke";
		//Character,isAlphabetic(codePoint) ---> to verify if name is valid
		boolean isValid = false;
		
		
		//we can use for each loop only with collections of data 
		//since name is String we need to use method .toCharArray() that will convert 
		//string into array of chars
		 for (int i = 0; i < name.length(); i++) {
	            char var = name.charAt(i);
	            isValid = Character.isAlphabetic(var);
	            
	            if(isValid == true) {
	                System.out.println(var + " : letter");
	            }else {
	                System.out.println(var + " : not letter");
	            }
	        }
		
	}
}
