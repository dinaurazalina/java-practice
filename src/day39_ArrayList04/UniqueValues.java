package day39_ArrayList04;

import java.util.*;

public class UniqueValues {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();// polimorphism
		Scanner scan = new Scanner(System.in);

		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);
 
		//find non duplicate unique values,
		List<Integer> unique1 = new ArrayList<>();
		
		for(Integer num: nums) {
			//assign num to unique1 if num is not there already
			
			if(!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println(unique1);
		
		//find unique (appearing only once!)values
		//List<Integer> nums2 = new ArrayList<>();
//		int count = 0;
//		for (int i = 0; i < nums.size(); i++) {
//			for (int j = 0; j < nums.size(); j++) {
//				if (nums.get(i) == nums.get(j)) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				nums2.add(nums.get(i));
//
//			}
//			count = 0;
//		}
//		System.out.println(nums2);
		
		
		List<Integer> unique2 = new ArrayList<>();
		for(int i = 0; i< nums.size(); i++) {
			int count = 0;
			Integer value =nums.get(i);
			for(int k =0; k <nums.size(); k++) {
				if(nums.get(k) ==value && i != k) {
					count++;
					break;//once it find a value, it will break the inner (k) loop 
				}
			}
			if(count ==0) {
				unique2.add(value);
			}
		}
		System.out.println(unique2);
		
	}
}
