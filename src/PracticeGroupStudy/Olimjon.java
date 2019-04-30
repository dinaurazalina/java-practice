package PracticeGroupStudy;

import java.util.ArrayList;

public class Olimjon {
	public static void main(String[] args) {
	
		
		
		int [] nums = {1, 1, 2, 3, 4, 3, 4};
		
		int counter = 0;
		int notDouble = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j]) {
					counter++;
				}
			}
			if(counter == 1) {
				notDouble = nums[i];
			}
			counter =0;
			
		}
		System.out.println(notDouble);
		
		
		
		
		
		
		
		
		
		
		
		int [] nums = {1, 1, 2, 3, 4, 8, 5 , 6 , 8 , 6, 3, 4};
		int counter = 0;
		int notDouble = 0;
		ArrayList arrList = new ArrayList();
		
		
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j]) {
					counter++;
				}
			}
			if(counter == 1) {
				arrList.add(nums[i]);
			}
			counter =0;
			
			
		}
		
		System.out.println(arrList);
	}

}
