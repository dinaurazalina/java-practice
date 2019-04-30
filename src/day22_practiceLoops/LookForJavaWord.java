package day22_practiceLoops;
import java.util.*;
public class LookForJavaWord {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String sentence = "He said hi, then she replied hi. hi guys!";
	String hi = "hi";
	int howMany = 0;
	
	for(int i = 0; i < sentence.length()-1; i++) {
		if (sentence.substring(i, i+2).equals("hi")){
			howMany += 1; 
		}
	}
			
			System.out.println(howMany + " is how many hi in the sentence");
			
			
			
}
}
