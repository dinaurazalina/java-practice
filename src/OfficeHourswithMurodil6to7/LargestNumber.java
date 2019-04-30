package OfficeHourswithMurodil6to7;

public class LargestNumber {
public static void main(String[] args) {
	
			
			int [] [] num2 = { {123, 456, 23, 56, -334, 23, 35, 5},
							{345, 657567, 32, 578, 4565, -34435, 43},
							{43554, -23, 4567, 906, 8765, 3, 2333}  };
			
			
			
			//outer loop 
			//that is changing rows
			 int max = num2[0][0];
			 int min = num2[0][0];
			 int countPositive = 0;
			 int countNegative = 0;

			 int total = 0;
			 for(int rows = 0; rows <num2.length; rows++) {
				 //inner loop 
				 //changing column
				 //num2.length means length of the specific array
				 //if rows = 0, then its gonna be length of the first array
				 
				 for(int columns = 0; columns < num2[rows].length; columns++) {
					 if(num2[rows][columns]> max) {
						 max = num2[rows][columns];
						 
					 }
					 if(num2[rows][columns] < min) {
						 min = num2[rows][columns];
					 }
					 if(num2[rows][columns]>0) {
						 countPositive++;
					 }else if(num2[rows][columns]<0) {
						 countPositive++;
					 }
					 total+= num2[rows][columns];
				 }
				 	
			 
			 }
			 System.out.println("Minimum " + min);
			 System.out.println("Maximum " + max);
			 System.out.println("We have " + countPositive + " positive numbers");
			 System.out.println("We have " + countNegative + " negative numbers");
		}


}

