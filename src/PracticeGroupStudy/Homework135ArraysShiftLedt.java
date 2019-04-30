package PracticeGroupStudy;
import java.util.*;
public class Homework135ArraysShiftLedt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[]nums = new int[size];
		for(int i = 0; i< size; i++) {
			nums[i]= scan.nextInt();
		}
		/*Example: 
				orig: 6, 2, 5, 3
				shifted: [2, 5, 3, 6]
		 * 
		 */
		
		
		int [] shifted = new int [nums.length];
		for(int i = 0; i <nums.length-1; i++) {
			shifted[i]=nums[i+1];
		}
		shifted[shifted.length-1]= nums[0];
		System.out.println(Arrays.toString(shifted));
	}
}
