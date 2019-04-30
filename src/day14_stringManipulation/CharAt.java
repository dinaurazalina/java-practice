package day14_stringManipulation;

public class CharAt {
public static void main(String[] args) {
	String word = "Com puter";

//print all characters one by one
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(1));
	System.out.println(word.charAt(2));
	System.out.println(word.charAt(3));
	System.out.println(word.charAt(4));
	System.out.println(word.charAt(5));
	System.out.println(word.charAt(6));
	System.out.println(word.charAt(7));
	System.out.println(word.charAt(8));

	String word2 = "poohchi";
	if (word2.charAt(0) == 'J') {
		System.out.println("J is the first character of " + word2);
	}else {
		System.out.println("J is not the first character of " + word2);
	}
	
	
	String word3 = "Lunch";
	if (word3.charAt(0) == word3.charAt(4)) {
		System.out.println("FIrst and last match");
	}else {
		System.out.println("first and last not dont match");
	}
	
	//always print the last character no matter the length 
	String word4 = "fkndfdkdlkmdkmdmkkeidkdkdkfkdkdkshehthfjfjdekdekfjgng";
	//nested method 
	char lastChar = word4.charAt(word4.length()-1);
	System.out.println("last value of " +word4 +" is "+lastChar);
	
    String word5 = "gemini";
    //WRITE YOUR CODE HERE
    char lastLetter = word5.charAt(word5.length()-1);
    System.out.print(word5.charAt(0));
    System.out.print(lastLetter);
}
}
