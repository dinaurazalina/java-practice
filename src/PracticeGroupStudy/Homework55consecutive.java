package PracticeGroupStudy;
import java.util.Scanner;
public class Homework55consecutive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	
		 boolean isconsecutive = true;
		 
		 for(int i = 0; i < nums.length -1; i++) {	
			 if(nums[i] == nums[i+1] ) {
				isconsecutive = true;
				break;
		}else {
				isconsecutive = false;
		}
		}
	
	System.out.println(isconsecutive);
	
	
	
	
	}
}
