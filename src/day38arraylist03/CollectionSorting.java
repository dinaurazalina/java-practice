package day38arraylist03;
import java.util.*;
public class CollectionSorting {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> numsList = new ArrayList<>();
		
		numsList.add(44);
		numsList.add(1);
		numsList.add(1000);
		numsList.add(2);
		System.out.println(numsList);
		
		System.out.println("Sorting ... please wait...");
		
		Collections.sort(numsList);
		
		System.out.println(numsList);Thread.sleep(1000);
		
		
		List<String> strList = new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Dina");
		strList.add("Bojan");
		strList.add("Maria");
		System.out.println("Sorting ... please wait...");
		Collections.sort(strList);
		System.out.println(strList);
		
		
		//max, min
		
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		
		System.out.println("max name "+ maxNum);
		System.out.println("min name "+ minNum);
		
		String maxName =  Collections.max(strList);
		String minName =  Collections.min(strList);
		System.out.println("max name "+ maxName);
		System.out.println("min name "+ minName);
		
	}
}
