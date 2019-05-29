package day38arraylist03;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("January");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1; //list1, list2 point to the same object meaning that if list1/list2 changes, list2/ list1 will change too
		ArrayList<String> months = new ArrayList<>(list1); //constructor
		System.out.println(months);
		
		months.add("June");
		months.add("July");
		months.add("Aug");
		
		System.out.println(months.contains("January"));//returns a boolean value
		System.out.println(months.contains("December"));
		System.out.println(months.contains("June"));//doesnt care what index it is located at
		
		//how would you check if Feb is in second position
		
		
		System.out.println(months.indexOf("Feb") == 1);
		System.out.println(months.get(1).contentEquals("Feb")); //months.clear(); in case of array becomes empty, 
															   // the index wont be there anymore. So it will give you outOfBounds exceptions
		
		
		ArrayList<String> months2 = new ArrayList<>(list1);
		
		System.out.println("Months :" + months.toString());
		System.out.println("Months2:" + months2.toString());
		
		
		
		//add one May to months2
		
		months2.add("May");
		
		
		//check if months has all the values of Month2
		if(months.containsAll(months2)) {
			System.out.println("It contains all the elements");
		}else {
			System.out.println("Some elements are missing");
		}
		
	}
}
