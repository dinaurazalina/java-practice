package day16_stringManipulation;

public class replaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Coding is fun, it is my hobby!!";

		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
	
	System.out.println(sentence.replace(",", "!!!"));
	
	String mixed = "@#$!&****&ja-v&^%$a*&&^*^%&%$#@";
	//clean up 
	mixed = mixed.replace("@#$!*&", "");
	System.out.println(mixed);
	
	mixed = mixed.replace("#", "");
	System.out.println(mixed);
	
	
	
	String result = "About 150,000,000 results (0,59 seconds)";
	// using replace get the number of results
	
	

	//result = result.replace( "results (0,59 secondsresults (0,59 seconds"), "");
	result = result.substring(0, result.indexOf(" "));


System.out.println(result);


result -
	}

}
