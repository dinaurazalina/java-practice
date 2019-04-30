package PracticeGroupStudy;

public class FindSecondLargest {

	public static void main(String[] args) {
		 
		int [] nums = {56, 4, 3, 78, 79, 55, 6, 23, 4};
		
		int largest = Integer.MIN_VALUE;
		int secLargest =  Integer.MIN_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]> largest) {
				largest = nums[i];
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]> secLargest && nums[i] < largest) {
				secLargest = nums[i];
			}
		
		}
		
		
		System.out.println(largest+"  "+secLargest);
	}
}
