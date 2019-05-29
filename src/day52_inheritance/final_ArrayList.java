package day52_inheritance;
import java.util.*;
public class final_ArrayList {
//public 		 > is access modifier
//final, static  > non - access, modifier
	public static void main(String[] args) {
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("orange");
		COLORS.add("grey");
		COLORS.add("blue");
		COLORS.add("white");
		
		System.out.println(COLORS.toString());
		
		COLORS.add("BLACK");
		System.out.println(COLORS.toString());
		
		//it will not compile cuz it is not possible to assign to new object when the arraylist is final
//		COLORS = new ArrayList<>(); //new object 
//		System.out.println(COLORS.toString());
//		
//		COLORS.add("YELLOW");
//		System.out.println(COLORS.toString());
//		
	}
}
