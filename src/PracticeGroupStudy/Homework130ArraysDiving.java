package PracticeGroupStudy;
import java.util.*;
public class Homework130ArraysDiving {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 float total = 0;
		    float[] score = new float[7];
		    //WRITE YOUR CODE HERE
		    int i = 0;
		    int count = 0;
		  while(i< score.length) {
			   count++;
			  System.out.println("Enter score for judge "+count +":");
			  
			  score [i] = input.nextFloat();
			  i++;
		  }
		    
		    System.out.println("Enter difficulty:");
		    float diff = input.nextFloat();
		    
		   Arrays.sort(score);
		   float sum = 0;
		   for(int j =1 ; j < score.length-1; j++) {
			   sum +=score[j];
		   }
		   total = sum * diff;
		   total *=0.6;
		    
		    // FINAL OUTPUT
		    System.out.printf("Total: %.2f", total);
	}
}
