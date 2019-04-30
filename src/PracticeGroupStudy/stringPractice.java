package PracticeGroupStudy;

public class stringPractice {

	public static void main(String[] args) {
		
		
		//To count how many letters you have in your sentence:
		
		String myStrings = "I try to practice java everyday.This is the only way I can suceed! Keep going";
		int stringLength = myStrings.length();
		System.out.println("The length of my string is: " + stringLength);
	
		//To make your text all UPPER case or lower case
		
		String bigLetters = "Big Apple";
		System.out.println(bigLetters.toUpperCase());
		System.out.println(bigLetters.toLowerCase());
		
		//to locate your string
		String location = "Please locate where ble ble ble dgfhujikol fgf \"locate\" occurs";
		System.out.println(location.indexOf("locate"));
		
		
		// another way of concatenation of 2 strings
		
		String one = "bla bla bla";
		String two = " ble ble ble";
		
		System.out.println(one.concat( two));
		
		
		int x = 6;
		int y = 7;
		
		System.out.println(x+y);
		
		String blep = "No addition now ";
		
		System.out.println(blep + x +y);
	}
}
