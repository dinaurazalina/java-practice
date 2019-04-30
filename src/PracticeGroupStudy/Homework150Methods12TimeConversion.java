package PracticeGroupStudy;
import java.util.*;
public class Homework150Methods12TimeConversion {
	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
	  }
	  
	  public static void timeConversion(String s ) {
	    /*
			 * Write your code here.
			 */
			 
		  String [] arr = s.split(":");
		  
		  if(arr[2].contains("PM")) {
			  arr[0]=Integer.toString(Integer.parseInt(arr[0])+12);
		  }
		 arr[2]= arr[2].replaceAll("\\D", " ");//if it is not a number get rid of it 
	
		 for(int i = 0; i< arr.length; i++) {
			 System.out.print(arr[i]);
			 if(i!=arr.length-1) {
				 System.out.print(":");
			 }
		 }
	  }
	}

