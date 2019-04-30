package PracticeGroupStudy;
import java.util.Scanner;
public class Homework145Methdos7Plusminus {
	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  }//end main
	   
	  public static void plus_minus(int [] arr) {
		  int neg =0;
		  int pos= 0;
		  int zero = 0;
		  for(int i = 0; i < arr.length; i++) {
			  if(arr[i]< 0) {
				  neg++;
			  }else if(arr[i]> 0) {
				  pos++;
			  }else if(arr[i]==0) {
				  zero++;
			  }
			  
		  }
		  System.out.println("positives:"+ pos + ", negatives:" + neg + ", zeros:"+ zero);
		  
	  }
	}

