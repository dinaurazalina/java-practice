package day41_CustomClassewithArrays;
import java.util.*;
public class warmUpWithList {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);ints.add(5);ints.add(7);	
		
		
		System.out.println(doubleTheList(ints));
	}
	public static List<Integer> doubleTheList (List<Integer> nums){
		
		 for(int i =0; i< nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		 }
		 return nums;
	}
}
