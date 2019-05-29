package day38arraylist03;
import java.util.*;
public class MethodsSummary {

	public static void main(String[] args) {
		List <String> list1 = new ArrayList<>();
		
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		list1.add("pink");
		//add method with index: "yellow" will be placed to index 0
		list1.add(0, "yellow");
		
 		
		//toString method to print all values in same line
		System.out.println(list1.toString());
		
		//size method
		System.out.println("Number of elements: " + list1.size());
		
		//get method. return number from index
		System.out.println("3: " + list1.get(3));
		System.out.println("0: " + list1.get(0));
		
		//remove using index. removes value from index position
		list1.remove(0);//removes "yellow"
		System.out.println(list1);
	
		//remove using value/ element. removes element first occurence
	
		list1.remove("blue");//removes blue
		System.out.println(list1);
		
		//set method(index, value) replace certain index with new value
		list1.set(0, "orange");
		System.out.println(list1);
		
		
		//indexOf(value). returns index of value in the list
		System.out.println("pink: " + list1.indexOf("pink"));
	
	
		//isEmpty return true if list is empty(when size == 0)
		System.out.println("Is list empty? -" + list1.isEmpty());
		System.out.println("Is list empty? -" + (list1.size()==0));
		
		//contains method >>true is value is present
		
		System.out.println("white in list? "+list1.contains("white"));
		
		
		List<String> list2 = new ArrayList<>();
		//addAll > adds all values from one list into another
		list2.addAll(list1);
		System.out.println("list2: "+list2.toString());
	
		//containsAll. check if list has all values of another list
		System.out.println("ContainsAll "+list1.containsAll(list2));
		
		//equals (list) checks if 2 lists are exactly equal
		
		System.out.println("Are equal? "+ list2.equals(list1));
		
		list2.add("turquoise");
		list2.removeAll(list1);
		System.out.println("RemoveAll from list1: " + list2);
		
		//addAll(index, list ) adds a new list values starting from given index
		list2.addAll(0, list1);
		System.out.println("list2 after list2.addAll(0, list1) : " + list2);
		
		
		//clear method
		
		list1.clear();
		list2.clear();
		
		System.out.println("both empty?" +(list1.isEmpty() && list2.isEmpty()) );
	}
}
