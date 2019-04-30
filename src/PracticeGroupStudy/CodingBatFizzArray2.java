package PracticeGroupStudy;

import java.util.Arrays;

public class CodingBatFizzArray2 {

	public static void main(String[] args) {
		
		//fizzArray2(4) → ["0", "1", "2", "3"]
		//fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
	
		
		
		//Note: String.valueOf(xxx) will make the String form of most types. 
		int n = 10;
	
		  String[] fizzArray2 = new String [n];
		  
		  for(int i =0; i<fizzArray2.length; i++){
		    fizzArray2[i] = String.valueOf(i);
		  }
		  System.out.println(Arrays.toString(fizzArray2));
		}
	
	
	
	
	}

