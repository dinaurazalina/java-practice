package LeetCode;
import java.util.*;

public class met {
	
	  public static void main(String[] args) {
	    double weight = 0;
	    double cal = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter weight in pounds:");
	    
	    //first lbt > kilograms 			1kg = 2.2 
	    int weigthP = scan.nextInt();
	    
	    weight = weigthP/2.2;
	
	   
	  int totalMets = 10 *30 +  8 *30 + 6*60;
	  cal = 0.0175 * totalMets *weight;
	  int cal1 = (int) cal;
	  System.out.println("Calories Burned: "+ cal1);
	  }
}
