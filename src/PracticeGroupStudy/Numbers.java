package PracticeGroupStudy;

import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {
	

		int [] nums = {123, 345, 23, 454};
		//get 2 elements from array
		
		System.out.println(nums[1]);
		nums[1]= 5;
		
		System.out.println(Arrays.toString(nums));
		
		//find max number
		
		int max = nums [0];
		
		for(int num: nums) {
			if(num>max) {
				max = num;
			}
		}
		
		System.out.println("Maximum: "+ max);
		
		
 	}
}
