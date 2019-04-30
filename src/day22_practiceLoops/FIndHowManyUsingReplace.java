package day22_practiceLoops;

public class FIndHowManyUsingReplace {
public static void main(String[] args) {
	
	String word = "including webpages, images";
	
	int length = word.length();
	System.out.println("length1 : " + length);
	String without = word.replace("e", "");
	
	int length2 = without.length();
	System.out.println("length2 : " + length2);
	int result = length - length2;
	System.out.println("Result: " + result);
}
}
