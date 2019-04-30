package PracticeGroupStudy;

public class ArrayOrder {

	public static void main(String[] args) {
		int [] nums = new int[] {1, 1, 4, 6, 7, 12};
		int [] nums2 = new int[] {1, 4, 6, 3, 7, 4, 12};
		int [] nums3 = new int[] {146, 3, 7, 412};
		isArraySorted(nums);
		isArraySorted(nums2);
		isArraySorted(nums3);
	}
									//method accepts array of ints
	public static void isArraySorted(int[] nums) {
		boolean sorted = true; //local variable inside the method
		for(int i = 0; i< nums.length-1; i++) {
			//System.out.println(nums[i] + " " + nums[i+1]);
		
			if(nums[i]> nums[i+1]) {
				sorted = false;
				break;
			}
		}
		System.out.println("The array of num is sorted? " + sorted);
	}
}
