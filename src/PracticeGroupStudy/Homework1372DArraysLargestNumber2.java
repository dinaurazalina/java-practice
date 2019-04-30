package PracticeGroupStudy;
import java.util.*;
public class Homework1372DArraysLargestNumber2 {

	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++){
	      for(int j=0 ;j<=cols-1;j++){
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    
	    //TODO write your code below
	    
	    int max= Integer.MIN_VALUE;
	    for (int i = 0; i < arr.length; i++) {
	    	for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			for(int k = 0; k < arr.length;k++) {
				for (int j = 0; j < arr.length; j++) {
					arr[k][j] = max;
				}
			}
		}
	    
	    //FINAL PRINT
	    System.out.println(Arrays.deepToString(arr));
	    
	   
	  }
	}

