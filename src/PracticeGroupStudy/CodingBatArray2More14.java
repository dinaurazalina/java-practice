package PracticeGroupStudy;

public class CodingBatArray2More14 {

	public static void main(String[] args) {
		int [] nums = {1, 4, 1, 4, 1, 6};
		 boolean more14 = false;
		  
		  int sumOne = 0;
		  int sumFour = 0;
		 
		  for(int i = 0; i< nums.length; i++){
		    if(nums[i]==1){
		      sumOne ++;
		    }
		    if(nums[i]==4){
		      sumFour++;
		    }
		  }
		  
		  if(sumOne > sumFour){
		    more14 = true;
		  }
		  
		  
		  System.out.println( more14);
		}
	}

