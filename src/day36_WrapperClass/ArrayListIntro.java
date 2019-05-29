package day36_WrapperClass;
import java.util.ArrayList;
public class ArrayListIntro {
	
	public static void main(String[] args) {
		
		//to create an ArrayList
		
		ArrayList <String> names = new ArrayList<>();
		ArrayList <Integer> nums = new ArrayList <>();
		
		//how to assign values into ArrayList
		
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");
		
		nums.add(100);
		nums.add(99);
		nums.add(656);
		nums.add(7);
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(nums);
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
	}

}
