package PracticeGroupStudy;
import java.util.*;
public class Homework170MethodsWithString5CleanString {

	public static void main(String[] args) {
		String str = "foo bar";
		String bad = "foo";
		str=str.replace(bad, "");
		System.out.println(str);
		
		
		
		//System.out.println(clean("foo bar", "foo"));
	}
	
	 public static String clean (String text ,String badWord) {

	 
	 String [] textArr= text.split(" ");
	 String clean = "";
	 
	 for(int i = 0; i < textArr.length; i++) {
		 if(!(textArr[i] .equals(badWord))) {
			 clean += textArr[i] + " ";
		 }
	 }
	 clean = clean.trim();
	 return clean;
	 
	 }
		 
}
