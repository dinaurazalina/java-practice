package day36_WrapperClass;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		
		//declare arrayList called languages
		
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add("English");
		languages.add("Russian");
		languages.add("French");
		languages.add("Polish");
		languages.add("Arabic");
		
		System.out.println("Number of values: " + languages.size());
		languages.add("Portugese");
		System.out.println("Number of values: " + languages.size());
		
		//remove java 
		
		languages.remove(0);
		System.out.println("Number of values: " + languages.size());
		//to print it out 
		System.out.println(languages.toString());
	}
}
