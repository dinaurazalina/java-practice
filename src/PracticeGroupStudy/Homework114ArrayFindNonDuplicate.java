package PracticeGroupStudy;
import java.util.*;
public class Homework114ArrayFindNonDuplicate {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in); 
	
	 int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

	// 1, 2, 1, 4, 2, 4, 3
	 
	// System.out.println(Arrays.toString(nums));
	
	 for(int i = 0; i < nums.length-1; i+=2) {
		 Arrays.sort(nums);
		 if(nums[i] == nums [i+1]) {
			System.out.println("");
		 }else {
			 System.out.println(nums[i]);
			 break;
		 }
	 }
	 
System.out.println(nums[6]);

}
}
