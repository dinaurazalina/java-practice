package PracticeGroupStudy;

public class CodingBatMaxNumber {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2; 
		int c = 3;
		int max = 0;
		if (a > b) {
		    max = a;
		  } else {
		    max = b;
		  }
		  
		  // Now check between max and c
		  if (c > max) {
		    max = c;
		  }
		  
		 System.out.println(max);
	}
}
