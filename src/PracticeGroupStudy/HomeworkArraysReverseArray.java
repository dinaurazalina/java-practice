package PracticeGroupStudy;
import java.util.*;
public class HomeworkArraysReverseArray {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    int temp = 0;
		    int last= 0;
		    for(int i = 0; i < nums.length/2; i++){
		      temp= nums [i];
		      last = nums.length -1;
		      nums[i] = nums[last - i];
		      nums[last-i] = temp;
		    }
		    
		    
		    //Do not change below statement:
		    System.out.println(Arrays.toString(nums));
	}
}
